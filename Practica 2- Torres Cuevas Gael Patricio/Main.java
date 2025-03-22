import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        Reloj reloj = new Reloj(11, 59); // Valor inicial

        int opcion;

        do {
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║      MENÚ DEL RELOJ       ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║ 1. Mostrar la hora actual  ║");
            System.out.println("║ 2. Iniciar reloj           ║");
            System.out.println("║ 3. Configurar hora         ║");
            System.out.println("║ 4. Salir                   ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hora actual: " + reloj.obtenerHora());
                    break;
                case 2:
                    System.out.println("Iniciando el reloj... (Presiona 'q' y ENTER para detenerlo)");
                    reloj.iniciar();
                    break;
                case 3:
                    System.out.print("Ingrese la hora (1-12): ");
                    int nuevaHora = scanner.nextInt();
                    System.out.print("Ingrese los minutos (0-59): ");
                    int nuevosMinutos = scanner.nextInt();
                    reloj.setHora(nuevaHora, nuevosMinutos); // Se usa setHora() en vez de crear un nuevo objeto
                    System.out.println("Hora configurada correctamente.");
                    break;
                case 4:
                    System.out.println("🚪 Saliendo del programa...");
                    break;
                default:
                    System.out.println("⚠ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

