package teste;
public class Teste {

    public static void main(String[] args) {
        area(25);
        System.out.println("A area do quadrado: " + area(25) );
        area(20,15);
        System.out.println("A area do retangulo: " + area(20,15) );
    }
    
    public static double area(double lado){
       return lado*lado;
    }
    
    
    public static double area(double altura, double base){
        return altura * base ;
    }
}
