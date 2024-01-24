package ex13;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        float taxa = (float) 0.02;
        Scanner leitura = new Scanner(System.in); 
        System.out.println("Digite o capital investido: ");
        float capital = leitura.nextFloat();
        for(int i = 1; i < 13; ++i){
        float total = (float)  (capital + (capital * (taxa * i)));
        capital = total;
        System.out.printf("\nNo final do mes " + i + " seu capital rendeu R$ %.2f ", total);   
        }
    }
    
}
