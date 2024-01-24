package ex15;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        int n1 = 0;
        Scanner leitura = new Scanner(System.in);
        do{
            System.out.println("Digite a temperatura em Celsius pra obter em Fahrenheit");
            float cel = leitura.nextFloat();
            float fah =(float) (32 +  (cel * 9.0/5.0));
            System.out.println(cel + " graus Celsius eh igual a " + fah + " Fahrenheit");
            System.out.println("Digite 1 para continuar (1) para continuar e (0) para encerrar a conversao!!");
            n1 = leitura.nextInt();
        }while (n1 != 0);
    }
    
}
