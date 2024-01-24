package ex02;
public class Ex02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Acumulador numero = new Acumulador(0, 0);
        numero.totalize(4);
        numero.totalize(5);
        numero.totalize(10);
        numero.totalize(9);
        numero.status();
    }
    
}
