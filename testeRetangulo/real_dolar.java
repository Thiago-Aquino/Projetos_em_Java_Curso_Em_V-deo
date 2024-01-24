
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
  
         Scanner scan = new Scanner(System.in);
         double dolar;
         dolar = 5.20;
         System.out.println("Insira a quantos dólares deseja converter para reais");
         double real = scan.nextDouble();
        
        double conversao = dolar * real;


         System.out.printf("O valor em dolar é de %.2f", conversao);

      
 
        }
}
