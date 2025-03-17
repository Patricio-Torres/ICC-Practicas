public class MainRecipiente {
    public static void main(String[] args) {
        // Crear recipientes
        Recipiente recipiente1 = new Recipiente(10, 5);
        Recipiente recipiente2 = new Recipiente(8, 4);

        System.out.println("Recipiente 1" + recipiente1.muestra());
        System.out.println("Recipiente 2" + recipiente2.muestra());

        System.out.println("\n¿El recipiente 1 está vacío? " + recipiente1.estaVacio());
        System.out.println("¿El recipiente 2 está vacío? " + recipiente2.estaVacio());
        
        System.out.println("\n¿El recipiente 1 está lleno? " + recipiente1.estaLleno());
        System.out.println("¿El recipiente 2 está lleno? " + recipiente2.estaLleno());

        recipiente1.rellena(400);
        System.out.println("\nDespues de rellenar con 400cm³ en el recipiente 1 tenemos: "+ recipiente1.muestra());
        recipiente2.rellena(400);
        System.out.println("\nDespues de rellenar con 400cm³ en el recipiente 2 tenemos: "+ recipiente2.muestra());

        recipiente1.vierte(recipiente2);
        System.out.println("\nVertimos el recipiente 1 en el 2 \nRecipiente1" + recipiente1.muestra() + "\nRecipiente 2: "+ recipiente2.muestra());

        recipiente1.vacia();
        System.out.println("\nVaciamos el contenido del Recipiente 1: " +recipiente1.muestra());

        recipiente1.rellena(243);
        System.out.println("Rellenamos con 243cm³ al Recipiente 1:" + recipiente1.muestra());

        Recipiente recipiente3 = recipiente1.creaContenedorJusto();
        System.out.println("Creamos un recipiente justo: " +recipiente3.muestra());
        
        recipiente1.vierte(recipiente3);
        System.out.println("Vertemos el contenido del recipiente 1 en el 3: "+ "\nRecipiente 1" + recipiente1.muestra()+ "\nRecipiente 3: " + recipiente3.muestra());

        Recipiente recipiente4 = new Recipiente(4, 5.00);
        System.out.println("\nCreamos un recipiente 4: " + "\nRecipiente 3: "+recipiente3.muestra() + "\nRecipiente 4: "+recipiente4.muestra()+ "¿Son iguales?: " + recipiente3.mismasDimensiones(recipiente4));

        System.out.println("Le cabe más al recipiente 2 respecto al 4? " + recipiente4.cabeMas(recipiente2));

        recipiente4.rellena(300);
        System.out.println("¿Tiene más contenido el recipiente 4 que el 1? " + recipiente4.contieneMas(recipiente1));

        System.out.println("\nRecipiente 1: " +recipiente1.muestra() + "\nRecipiente 4" + recipiente4.muestra());

        System.out.println("Recipiente 1 : " + recipiente1.muestra());
        System.out.println("Recipiente 2 : " + recipiente2.muestra());
        System.out.println("Recipiente 3 : " + recipiente3.muestra());
        System.out.println("Recipiente 4 : " + recipiente4.muestra());
    }
}