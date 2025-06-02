public class Main {
    public static void main(String[] args) {
        //Triangulo Forma 1
        FiguraGeometrica triangulo =  new Triangulo(6, 7, 5, 2, 7);
     System.out.println("Area: " + triangulo.obtenerArea() + "\nPerimetro" + triangulo.obtenerPerimetro());
        triangulo.toString();

        //Triangulo Forma 2
        Triangulo trianguloB =  new Triangulo(6, 7, 5, 2, 7);
     System.out.println("Area: " + trianguloB.obtenerArea() + "\nPerimetro" + trianguloB.obtenerPerimetro());
        trianguloB.toString();

        //Cuadrado  
        Cuadrado cuadrado =  new Cuadrado(3);
        System.out.println("Area: " + cuadrado.obtenerArea() + "\nPerimetro" + cuadrado.obtenerPerimetro());
        cuadrado.toString();
    
        //Rectangulo
        Rectangulo rectagulo =  new Rectangulo(5, 3);
        System.out.println("Area: " + rectagulo.obtenerArea() + "\nPerimetro" + rectagulo.obtenerPerimetro());
        rectagulo.toString();
    
    }
}
