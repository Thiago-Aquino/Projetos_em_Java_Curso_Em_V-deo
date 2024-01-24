package testefuncao01;

public class TesteFuncao01 {
    
    static int soma(int a, int b){
        int s = a + b;
        System.out.println("A soma: " + s);
        return s;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm );
        
    }
    
}
