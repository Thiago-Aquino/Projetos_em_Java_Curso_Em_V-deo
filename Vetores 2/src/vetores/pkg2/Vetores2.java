package vetores.pkg2;
import java.util.Scanner;
public class Vetores2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitura = new Scanner(System.in);
        float altura [] = new float [20];
        float tot = 0;
        int acima = 0;
        for(int pessoa = 1; pessoa < 21; pessoa++){
            System.out.printf("Digite a altura da " + pessoa + " pessoa: ");
            altura[pessoa] = leitura.nextFloat();
            tot = tot + altura[pessoa];
        }
        float med = (float) (tot/20);
        
        for(int pessoa = 1;pessoa < 21 ; pessoa++){
            if(altura[pessoa] > med){
                acima++;
            }
            
        }
        
        System.out.println("Media: " + med);
        System.out.println("Acima da media: " + acima);
    }
    
}
