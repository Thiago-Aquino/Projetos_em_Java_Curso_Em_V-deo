package ex07;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira nota do Alumo: ");
        float nota1 = leitura.nextFloat();
        System.out.println("Digite a segunda nota do Aluno:");
        float nota2 = leitura.nextFloat();
        float media = (float) ((nota1 + nota2) / 2);
        if(media >= 7){
            System.out.println("O aluno tirou " + media + " e foi APROVADO!!!");
        }else if(media >= 4 && media < 7){
            System.out.println("O aluno tiou " + media + " e esta em EXAME!!");
        }else if(media < 4){
            System.out.println("O aluno tirou " + media + " e foi REPROVADO!!");
        }        
    }
    
}
