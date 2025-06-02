package proyecto03;

public class Carta {
    int tamano;
    int color;
    int brazos;
    boolean gafas;
    boolean palomitas;

    public Carta(int tamano, int color, int brazos, boolean gafas, boolean palomitas) {
        this.tamano = tamano;
        this.color = color;
        this.brazos = brazos;
        this.gafas = gafas;
        this.palomitas = palomitas;
    }

    public boolean esCompatible(Carta otra) {
        int diferencias = 0;
        if (this.tamano != otra.tamano) diferencias++;
        if (this.color != otra.color) diferencias++;
        if (this.brazos != otra.brazos) diferencias++;
        if (this.gafas != otra.gafas) diferencias++;
        if (this.palomitas != otra.palomitas) diferencias++;
        return diferencias <= 1;
    }

    public String toString() {
        return "[" + tamano + "," + color + "," + brazos + "," + (gafas ? "B)" : " ") + "," + (palomitas ? "AC-II" : " ") + "]";
    }
}
