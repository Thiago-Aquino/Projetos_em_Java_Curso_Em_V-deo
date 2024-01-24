package ex11;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a altura e o sexo da pessoa pra obter seu peso ideal: ");
        System.out.println("Digite a altura");
        float altura = leitura.nextFloat();
        System.out.println("Digite o sexo,(1) para masculino e (2) para feminino");
        float sexo = leitura.nextFloat();
        if(sexo == 1){
            float peso = (float)((altura * 72.2) - 58);
            System.out.println("Peso ideal: " + peso);
        }else if(sexo == 2){
            float peso = (float) ((altura * 62.1) - 44.7);
            System.out.println("Peso ideal: " + peso);
        }else{
            System.out.println("Digite um sexo e uma altura valida!!");
        }
        
    }
}