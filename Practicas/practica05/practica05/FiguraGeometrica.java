public abstract class FiguraGeometrica{
    private double ladoA, ladoB, ladoC, ladoD, base, altura;
    
    public FiguraGeometrica(double ladoA, double ladoB, double ladoC, double ladoD, double base, double altura){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.base = base;
        this.altura = altura;
    }
    
    public double obtenerPerimetro(){
        return ladoA + ladoB + ladoC + ladoD;
    }

    public double obtenerArea(){
        return base*altura;
    }

    public String toString(){
        for(int i=0; i<base; i++){
            System.out.print("  *");
        }
        for(int j=0; j<altura-2; j++){
            System.out.print("\n  *");
            for(int k=0; k<base-2; k++){
                System.out.print("   ");
            }
            if( j == altura%2)
                System.out.print("  *    Altura: "+ altura);
            else    
                System.out.print("  *");
        }
        System.out.print("\n");
        for(int i=0; i<base; i++){
            System.out.print("  *");
        }
        System.out.println("\n  Base: "+ base);
        System.out.print("\n");
        return "";
    }

    public double getAltura(){
        return this.altura;
    }
}