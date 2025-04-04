package Practica3;

public class ListaLigada {
    private Nodo cabeza;
    private static int cantidadElementos = 0;

    public ListaLigada() {
        this.cabeza = null;
        cantidadElementos = 0;
    }

    public void insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        cantidadElementos++;
    }

    public void eliminar(int elemento) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.elemento == elemento) {
            cabeza = cabeza.siguiente;
            cantidadElementos--;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.elemento != elemento) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            cantidadElementos--;
        }
    }
    /* En esta parte necesité ayuda de un compañero, no lo tenemo igual pero me ayudó a hacerlo */
    public String toString() {
        if (cabeza == null) return "Lista vacía.";

        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.elemento).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        return sb.toString();
    }
    public void insertarIndice(int elemento, int indice) {
        if (indice < 0 || indice > cantidadElementos) return;

        Nodo nuevo = new Nodo(elemento);
        if (indice == 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
        cantidadElementos++;
    }
} 