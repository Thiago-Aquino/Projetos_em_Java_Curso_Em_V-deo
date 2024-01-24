package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitura = new Scanner(System.in);
        System.out.println("Primeira nota:");
        float n1 = leitura.nextFloat();
        System.out.println("Segunda nota:");
        float n2 = leitura.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua media foi: " + m);
        if (m>9){
            System.out.println("Parabens!");
        }
    }
    
}
