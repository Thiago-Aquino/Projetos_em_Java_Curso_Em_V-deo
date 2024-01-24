// n esta funcionando de forma correta
package exe14;
import java.util.Scanner;
public class Exe14 {
    public static void main(String[] args) {
        float taxa = (float) 1.0;
        int i;
        float total = (float) 0.0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu capital :");
        float capital = leitura.nextFloat();
        float dobro = capital * 2;
        for(i=0; total <= dobro ; i++){
            total = (float) total + ((capital * (taxa * i))); 
            
        }
        
        System.out.println("O capital dobrou no mes " + i);
    }
    
}
