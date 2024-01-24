package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = leitura.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = leitura.nextFloat();
        //float nota = 2.5f;
        //System.out.println("A nota : " + nota);
        //System.out.printf("A nota : %.4f \n", nota);
        System.out.format("Nota de %s : %.2f \n", nome, nota);
    }
    
}
