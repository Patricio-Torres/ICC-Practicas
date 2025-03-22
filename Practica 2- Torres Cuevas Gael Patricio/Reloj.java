import java.io.IOException;
import java.util.Scanner;

public class Reloj {
    private int segundo, minuto, hora;

    public Reloj(int hora, int minuto) {
        this.segundo = 0;
        this.minuto = minuto;
        this.hora = hora;
    }

    public void iniciar() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;

        System.out.println("El reloj ha iniciado. Presiona 'q' y ENTER para detenerlo.");

        while (ejecutar) {
            for (; hora <= 12 && ejecutar; hora++) {
                for (; minuto < 60 && ejecutar; minuto++) {
                    for (; segundo < 60 && ejecutar; segundo++) {
                        Thread.sleep(1000);
                        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);

                        // Verifica si el usuario quiere salir
                        if (System.in.available() > 0) {  // Verifica entrada sin bloquear
                            String input = scanner.nextLine();
                            if (input.equalsIgnoreCase("q")) {
                                ejecutar = false;
                                break;
                            }
                        }
                    }
                    segundo = 0;
                }
                minuto = 0;
            }
            hora = 1; // Resetea la hora después de un ciclo completo
        }

        System.out.println("Reloj detenido. Regresando al menú...");
    }

    public void setHora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public String obtenerHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
