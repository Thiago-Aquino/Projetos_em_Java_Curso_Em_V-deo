package ex16;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        int base, altura, area;
        Scanner leitura = new Scanner(System.in);
        do{
            System.out.println("Digite as vertices do retangulo");
            System.out.println("Digite o vertice superior");
            x1 = leitura.nextInt();
            System.out.println("Digite o vertice esquerdo");
            y1 = leitura.nextInt();
            System.out.println("Digite o vertice inferior");
            x2 = leitura.nextInt();
            System.out.println("Digite o vertice direito");
            y2 = leitura.nextInt();
            if(x1 != x2 && y1 != y2){
                System.out.println("as vertice nao formam um retangulo. Digite novamente!!");
            }
        }while(x1 != x2 && y1 != y2);
        area = x1 * y1;
        System.out.println("O retangulo possui \nbase   : " + x1 + "\naltura : " + y1 + "\narea   : " + area);
    }
    
}
