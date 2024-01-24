package programaidade;
import java.util.Scanner;
public class ProgramaIdade {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = leitura.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Sua idade: " + idade);
        if(idade>=18){
            System.out.println("Voce e maior de idade!");
        }else{
            System.out.println("Voce e menor de idade!");
        }
    }
    
}
