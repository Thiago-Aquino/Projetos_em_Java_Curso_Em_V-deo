package vetores;

import java.util.Scanner;


public class Vetores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        String vogais[] = new String [5];
        //String vogais1[] = {"A","E","I","O","U"};
        
        int dias[] = new int [12];
        //int dias1[] = {31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31 };
        
        
        int temp[][] = new int[7][2];
        System.out.println("Insita temperatura max e min:");
        
        
        for(int linha=0 ; linha < 7 ; linha++){
            for(int coluna = 0; coluna < 2 ; coluna ++){
                System.out.printf("Insira a temparatura para o dia [%d] (1:max e 2 min)[%d]: ",linha+1,coluna+1);
                temp[linha][coluna]=leitura.nextInt();
            }
        }
        
        System.out.println("\n Temperaturas \n");
        System.out.println(" \t max\t \t min \t");
        for(int linha=0 ; linha < 7 ; linha++){
            for(int coluna = 0; coluna < 2 ; coluna ++){
                System.out.printf("\t %d \t",temp[linha][coluna]);
            }
            System.out.println();
        }
        
        int notas[][] = new int[40][3];
        
        
    }
    
}
