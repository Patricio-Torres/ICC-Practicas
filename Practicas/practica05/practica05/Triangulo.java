public class Triangulo extends FiguraGeometrica{
    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura){
        super(ladoA, ladoB, ladoC, 0, base, altura);
    }

    public double obtenerArea(){
        return super.obtenerArea()/2; 
    }

    public double obtenerPerimetro(){
        return super.obtenerPerimetro();
    }

    public String toString(){
        int temp=0;
        System.out.println("  *");
        for(int i=0; i<super.getAltura()-2; i++){
            System.out.print("  *");
            for(int j=0; j<temp; j++){
                System.out.print("   ");
            }
            temp++;
            if(i == super.getAltura()%2)
                System.out.print("  *    Altura: "+super.getAltura()+"\n");
            else
                System.out.print("  *\n");
        }
        for(int k=0; k<temp+2; k++){
            System.out.print("  *");
        }
        System.out.println("\n  Base: " + (temp+1)/1.0);
        System.out.print("\n");
        return "";
    }
}
