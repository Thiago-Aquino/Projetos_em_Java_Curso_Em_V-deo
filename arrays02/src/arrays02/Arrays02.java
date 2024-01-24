package arrays02;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        int vet[][] = new int[4][3];
        Scanner leitura = new Scanner(System.in);
        System.out.println("Prateleira [4][3]\n");
        
        for(int linha=0 ; linha < 4 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("Insira a quantidade no compartimento[%d][%d]: ",linha+1,coluna+1);
                vet[linha][coluna]=leitura.nextInt();
            }
        }
        
        System.out.println("\nA prateleira ficou: \n");
        for(int linha=0 ; linha < 4 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("\t %d \t",vet[linha][coluna]);
            }
            System.out.println();
        }
    }
}
