package arrays01;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        double vet[] = {21.0, 22.0, 23.0, 24.0, 25.0, 26.0,
            27.0, 28.0, 29.0, 30.0, 31.0 , 32.0, 33.0, 34.0,
            35.0, 36.0, 37.0, 38.0, 39.0, 40.0 };
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero real usando virgula: ");
        double numero = leitura.nextDouble();
        
        if(numero < 21 | numero > 40){
            System.out.println("Este numero nao se encontra no vetor!");
        }
        else{
            double posicao = Arrays.binarySearch(vet, numero);
            System.out.format("O numero se encontra na posicao %.1f \n", posicao+1);
        } 
    }
    
}
