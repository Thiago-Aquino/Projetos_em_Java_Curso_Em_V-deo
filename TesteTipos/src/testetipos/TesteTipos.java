
package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "30.5";
        float idade1 = Float.parseFloat(valor2);
        System.out.printf("%.3f \n", idade1);
    }
    
}
