package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco( 1111,  "Jubileu" );
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        
        
        ContaBanco p2 = new ContaBanco(2222, "Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();
    }
}
