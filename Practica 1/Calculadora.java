import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=================================================" +
                "\n============  C A L C U L A D O R A  ============" +
                "\n=================================================" +
                "\n===========         1. SUMA            ==========" +
                "\n===========     2. MULTIPLICACIÓN      ==========" +
                "\n===========        3. DIVISIÓN         ==========" +
                "\n==========  4. CONVERTIDOR DE PALABRAS  =========" +
                "\n=================================================" +
                "\n===========  SELECCIONA UNA OPCIÓN:    ==========" +
                "\n=================================================");

        if (!scanner.hasNextInt()) {
            System.out.println("== ERROR: INGRESA UN NÚMERO ==");
            scanner.close();
            return;
        }

        int x = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del número

        if (x == 1) {
            System.out.println("==============  INGRESA UN NÚMERO: ==============");
            double y = scanner.nextDouble();

            System.out.println("==========  INGRESA EL SEGUNDO NÚMERO: ==========");
            double z = scanner.nextDouble();

            System.out.println("LA SUMA DE LOS NÚMEROS: " + y + " Y " + z + "\nES: " + (y + z));
        } else if (x == 2) {
            System.out.println("===========  INGRESA EL PRIMER FACTOR: ==========");
            double a = scanner.nextDouble();

            System.out.println("==========  INGRESA EL SEGUNDO FACTOR: ==========");
            double b = scanner.nextDouble();

            System.out.println("==  LA MULTIPLICACIÓN DE LOS NÚMEROS: " + a + " Y " + b + "\nES: " + (a * b));
        } else if (x == 3) {
            System.out.println("============  INGRESA EL DIVIDENDO: =============");
            double c = scanner.nextDouble();

            System.out.println("============  INGRESA EL DIVISOR:   =============");
            double d = scanner.nextDouble();

            if (d == 0) {
                System.out.println("ERROR: NO SE PUEDE DIVIDIR ENTRE CERO.");
            } else {
                System.out.println("======== LA DIVISIÓN DE LOS NÚMEROS: " + c + " Y " + d + "\nES: " + (c / d));
            }
        } else if (x == 4) {
            System.out.println("Escribe una palabra: ");
            String palabra = scanner.nextLine();

            if (palabra.isEmpty()) {
                System.out.println("== ERROR: INGRESA UNA PALABRA ==");
        
            } else {
                System.out.println("=================================================" +
                        "\n===========  SELECCIONA UNA OPCIÓN:    ==========" +
                        "\n=================================================" +
                        "\n================= 1. Minúsculas =================" +
                        "\n================= 2. MAYÚSCULAS =================" +
                        "\n=================================================");

                if (!scanner.hasNextInt()) {
                    System.out.println("== ERROR: INGRESA UN NÚMERO ==");
                    scanner.close();
                    return;
                }

                int conversion = scanner.nextInt();

                if (conversion == 1) {
                    System.out.println("La conversión resulta en: " + palabra.toLowerCase());
                } else if (conversion == 2) {
                    System.out.println("La conversión resulta en: " + palabra.toUpperCase());
                } else {
                    System.out.println("== ERROR: OPCIÓN INVÁLIDA ==");
                }
            }
        } else {
            System.out.println("== ERROR: OPCIÓN INVÁLIDA ==");
        }

        scanner.close();
    }
}
