package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Thiago";
        String nome2 = "Thiago";
        String nome3 = new String("Thiago");
        String res;
        res =(nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
