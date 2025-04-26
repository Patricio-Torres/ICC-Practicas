package Practica3;

public class Main {

    public static void main (String[] args){
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.insertar(24);
        lista.insertar(29);
        lista.insertar(07);
        lista.insertar(01);
        lista.insertar(04);

        System.out.println(lista);

        lista.eliminar(24);

        System.out.println(lista);

        lista.eliminar(01);

        System.out.println(lista);

        lista.insertarIndice(24, 3);

        System.out.println(lista);

        lista.insertarIndice(75, 10);

        System.out.println(lista);
    }
}
