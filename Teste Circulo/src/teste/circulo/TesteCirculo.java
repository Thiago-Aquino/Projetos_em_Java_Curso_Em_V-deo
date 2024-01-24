package teste.circulo;
public class TesteCirculo 
{
    public static void main(String[] args) 
    {
       Circulo c = new Circulo(10);
       c.exibeDados();
       
       c.setRaio(15);
       c.exibeDados();
    }
}
