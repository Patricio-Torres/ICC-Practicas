package proyecto03;

import java.util.Random;
import java.util.Scanner;


public class JuegoPickaPerro {
    static Carta[][] zona = new Carta[5][6];
    static Carta[] mazo = new Carta[96];
    static int cartasEnMazo = 0;
    static Random random = new Random(42);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Jugador humano = new Jugador("Humano");
        Jugador bot = new Jugador("Bot");

        prepararMazo();
        repartirCartas(humano, bot);
        rellenarZona();

        boolean juegoTerminado = false;
        while (!juegoTerminado) {
            turnoJugador(humano);
            turnoBot(bot);
            evaluarRonda(humano, bot);
            juegoTerminado = !puedeContinuar();
            if (!juegoTerminado) {
                repartirCartas(humano, bot);
                rellenarZona();
            }
        }
        mostrarGanador(humano, bot);
    }

    static void prepararMazo() {
        int index = 0;
        for (int i = 0; i < 2; i++) // tamaño
            for (int j = 0; j < 2; j++) // color
                for (int k = 1; k <= 2; k++) // brazos
                    for (int g = 0; g < 2; g++) // gafas
                        for (int p = 0; p < 2; p++) // palomitas
                            for (int r = 0; r < 3; r++) // 3 copias
                                mazo[index++] = new Carta(i, j, k, g == 1, p == 1);
        cartasEnMazo = 96;
        barajarMazo();
    }

    static void barajarMazo() {
        for (int i = 0; i < cartasEnMazo; i++) {
            int j = random.nextInt(cartasEnMazo);
            Carta tmp = mazo[i];
            mazo[i] = mazo[j];
            mazo[j] = tmp;
        }
    }

    static Carta robarCarta() {
        if (cartasEnMazo == 0) return null;
        return mazo[--cartasEnMazo];
    }

    static void rellenarZona() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; j++)
                zona[i][j] = robarCarta();
    }

    static void mostrarZona() {
        System.out.println("Zona de juego:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((zona[i][j] != null ? zona[i][j].toString() : "[     ]") + " ");
            }
            System.out.println();
        }
    }

    static void repartirCartas(Jugador... jugadores) {
        for (Jugador j : jugadores)
            j.agregarCarta(robarCarta());
    }

    static void turnoJugador(Jugador j) {
        boolean seguir = true;
        while (seguir) {
            mostrarZona();
            System.out.println("Carta guia: " + j.obtenerCartaGuia());
            System.out.print("¿Quieres tomar carta (T) o decir ¡Equipo completo! (E)? ");
            String entrada = scanner.nextLine().toUpperCase();
            if (entrada.equals("T")) {
                System.out.print("Ingresa fila y columna (ej. 2 3): ");
                int f = scanner.nextInt();
                int c = scanner.nextInt();
                scanner.nextLine();
                if (f >= 0 && f < 5 && c >= 0 && c < 6 && zona[f][c] != null) {
                    Carta seleccionada = zona[f][c];
                    if (seleccionada.esCompatible(j.obtenerCartaGuia())) {
                        j.agregarCarta(seleccionada);
                        zona[f][c] = null;
                    } else System.out.println("Carta no compatible.");
                } else System.out.println("Posición inválida.");
            } else if (entrada.equals("E")) seguir = false;
        }
    }

    static void turnoBot(Jugador b) {
        outer:
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; j++)
                if (zona[i][j] != null && zona[i][j].esCompatible(b.obtenerCartaGuia())) {
                    b.agregarCarta(zona[i][j]);
                    zona[i][j] = null;
                    return;
                }
    }

    static void evaluarRonda(Jugador h, Jugador b) {
        System.out.println("Secuencias de la ronda:");
        h.mostrarSecuencia();
        b.mostrarSecuencia();
        h.ganarPuntos();
        b.ganarPuntos();
        h.perderCartas();
        b.perderCartas();
        System.out.println("Puntos - " + h.nombre + ": " + h.puntos + ", " + b.nombre + ": " + b.puntos);
    }

    static boolean puedeContinuar() {
        return cartasEnMazo >= 2;
    }

    static void mostrarGanador(Jugador h, Jugador b) {
        System.out.println("Juego terminado.");
        System.out.println(h.nombre + ": " + h.puntos + " puntos");
        System.out.println(b.nombre + ": " + b.puntos + " puntos");
        if (h.puntos > b.puntos) System.out.println("Ganaste!");
        else if (h.puntos < b.puntos) System.out.println("Gana el bot.");
        else System.out.println("Empate.");
    }
}