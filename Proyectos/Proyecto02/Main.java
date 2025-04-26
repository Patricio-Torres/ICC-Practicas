package Proyecto2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Esteganografia e = new Esteganografia();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║            MENÚ ESTEGANOGRAFÍA            ║");
            System.out.println("╠═══════════════════════════════════════════╣");
            System.out.println("║ 1.  descifraNulo(texto, n)                ║");
            System.out.println("║ 2.  descifraNulo(texto con espacios)      ║");
            System.out.println("║ 3.  contieneNombre(texto, nombre)         ║");
            System.out.println("║ 4.  descifraPalabrasMarcadas(a, b)        ║");
            System.out.println("║ 5.  descifraLetrasMarcadas(a, b)          ║");
            System.out.println("║ 6.  Salir                                 ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            System.out.print("Elige una opción: ");

            int op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("\nIngresa el texto original: ");
                    String t1 = sc.nextLine();
                    System.out.print("\nIngresa la posición n: ");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println("\nResultado: " + e.descifraNulo(t1, n));
                    break;

                case 2:
                    System.out.print("\nIngresa el texto original (con espacios al final): ");
                    String t2 = sc.nextLine();
                    System.out.println("\nResultado: " + e.descifraNulo(t2));
                    break;

                case 3:
                    System.out.print("\nIngresa el mensaje: ");
                    String msg = sc.nextLine();
                    System.out.print("\nIngresa el nombre a buscar: ");
                    String nombre = sc.nextLine();
                    System.out.println("\n¿Contiene el nombre?: " + e.contieneNombre(msg, nombre));
                    break;

                case 4:
                    System.out.print("\nTexto A: ");
                    String m1 = sc.nextLine();
                    System.out.print("\nTexto B: ");
                    String e1 = sc.nextLine();
                    System.out.println("\nMensaje oculto: " + e.descifraPalabrasMarcadas(m1, e1));
                    break;

                case 5:
                    System.out.print("\nTexto A: ");
                    String m2 = sc.nextLine();
                    System.out.print("\nTexto B: ");
                    String e2 = sc.nextLine();
                    System.out.println("\nMensaje oculto: " + e.descifraLetrasMarcadas(m2, e2));
                    break;

                case 6:
                    System.out.println("\n¡Adiós!");
                    return;

                default:
                    System.out.println("\nOpción inválida");
            }
        }
    }
}
