package proyecto03;

public class ListaCarta {
    private Nodo cabeza;
    private int tamano;

    public ListaCarta() {
        cabeza = null;
        tamano = 0;
    }

    public void agregar(Carta carta) {
        Nodo nuevo = new Nodo(carta);
        if (cabeza == null) cabeza = nuevo;
        else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
        tamano++;
    }

    public Carta obtenerUltima() {
        if (cabeza == null) return null;
        Nodo actual = cabeza;
        while (actual.siguiente != null) actual = actual.siguiente;
        return actual.carta;
    }

    public void vaciar() {
        cabeza = null;
        tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.carta + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
