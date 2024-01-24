package ex14;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args, float total) {
        float taxa = (float) 0.10;
        int i;
        total = (float) 0.0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu capital :");
        float capital = leitura.nextFloat();
        for(i=1; total >= capital * 2; ++i){
            total = (float) (capital + (capital * (taxa * i)));
        }
        System.out.println("O capital dobrou no mes " + i);
    }
    
}
