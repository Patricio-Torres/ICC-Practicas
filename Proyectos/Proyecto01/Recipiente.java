
public class Recipiente implements ServiciosRecipiente {
    private double altura;
    private double radio;
    private double cantidadActual;

    public Recipiente(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
        this.cantidadActual = 0;
    }

    @Override
    public double capacidad() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double capacidadRestante() {
        return capacidad() - cantidadActual;
    }

    @Override
    public boolean estaVacio() {
        return cantidadActual == 0;
    }

    @Override
    public boolean estaLleno() {
        return cantidadActual == capacidad();
    }

    @Override
    public double rellena(double cantidad) {
        double capacidadDisponible = capacidadRestante();
        if (cantidad <= capacidadDisponible) {
            cantidadActual += cantidad;
            return 0; // 
        } else {
            cantidadActual = capacidad();
            return cantidad - capacidadDisponible;
        }
    }

    @Override
    public double vacia() {
        double cantidadVaciada = cantidadActual;
        cantidadActual = 0;
        return cantidadVaciada;
    }

    @Override
    public void vierte(Recipiente otro) {
        double espacioRestante = otro.capacidadRestante();
        if (cantidadActual <= espacioRestante) {
            otro.rellena(cantidadActual);
            cantidadActual = 0;
        } else {
            otro.rellena(espacioRestante);
            cantidadActual -= espacioRestante;
        }
    }

    @Override
    public boolean mismasDimensiones(Recipiente otro) {
        return this.altura == otro.altura && this.radio == otro.radio;
    }

    @Override
    public boolean mismaCapacidad(Recipiente otro) {
        return this.capacidad() == otro.capacidad();
    }

    @Override
    public boolean contieneMas(Recipiente otro) {
        return this.cantidadActual > otro.cantidadActual;
    }

    @Override
    public boolean cabeMas(Recipiente otro) {
        return this.capacidadRestante() > otro.capacidadRestante();
    }

    @Override
    public Recipiente creaContenedorJusto() {
        return new Recipiente(this.cantidadActual / (Math.PI * Math.pow(radio, 2)), radio);
    }

    @Override
    public String muestra() {
        return String.format("\nAltura: %.2f cm \nRadio: %.2f cm \nCapacidad: %.2f cm³ \nCantidad Actual: %.2f cm³ \nCapacidad Restante: %.2f cm³ \n",
                altura, radio, capacidad(), cantidadActual, capacidadRestante());
    }
}
