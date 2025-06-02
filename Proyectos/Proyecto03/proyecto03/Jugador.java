package proyecto03;

import java.util.Random;
import java.util.Scanner;

class Jugador {
    String nombre;
    ListaCarta secuencia;
    int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.secuencia = new ListaCarta();
        this.puntos = 0;
    }

    public Carta obtenerCartaGuia() {
        return secuencia.obtenerUltima();
    }

    public void agregarCarta(Carta carta) {
        secuencia.agregar(carta);
    }

    public void ganarPuntos() {
        puntos += secuencia.getTamano();
    }

    public void perderCartas() {
        secuencia.vaciar();
    }

    public void mostrarSecuencia() {
        System.out.print(nombre + ": ");
        secuencia.mostrar();
    }
}
