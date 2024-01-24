package teste.circulo;
public class Circulo 
{
    private double raio;
    
    
    
    public Circulo(double r)
    {
       setRaio(r); 
    }
    
    void setRaio(double r)
    {
        if (r < 0)
            System.out.println("O raio nao pode ser negarivo. ");
        else
            raio = r;
    }
        
    public double getRaio()
    {
        return raio;
    }
        
    public double diametro()
    {
        return raio*2;
    }
        
    public double area()
    {
        return Math.PI * Math.pow(raio,2);
    }
    
    public double circunferencia()
    {
        return 2 * Math.PI * raio;
    }
            
    public void exibeDados()
    {
        System.out.printf("\n============================================");
        System.out.printf("\n circulo de raio %.2f", getRaio());
        System.out.printf("\n Diametro      : %6.2f", diametro());
        System.out.printf("\n Circunferencia: %6.2f", circunferencia()); 
        System.out.printf("\n Area          : %6.2f", area());
        System.out.printf("\n============================================="); 
    }
}
