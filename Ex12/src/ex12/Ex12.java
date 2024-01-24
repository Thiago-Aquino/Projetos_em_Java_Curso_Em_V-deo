package ex12;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        float altura, mediaM = 0, mediaF = 0;
        int m = 0, f = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a altura e o sexo da pessoa pra obter seu peso ideal: ");
        do{
            System.out.println("Digite o sexo,(1) para masculino e (2) para feminino");
            int sexo = leitura.nextInt();
            System.out.println("Digite a altura");
            altura = leitura.nextFloat();
            if(sexo == 1){
                float peso = (float)((altura * 72.2) - 58);
                System.out.println("Peso ideal: " + peso);
                 mediaM += altura;
                 m++;
            }else if(sexo == 2){
                float peso = (float) ((altura * 62.1) - 44.7);
                System.out.println("Peso ideal: " + peso);
                mediaF += altura;
                f++;
            }else{
                System.out.println("Digite um sexo e uma altura valida!!");
            }
            }while(altura != 0);
        System.out.println("A media da altura Masculina " + mediaM/m + " Metros & A media da altura feminina " + mediaF/f + " Metros");
    }
    
}
