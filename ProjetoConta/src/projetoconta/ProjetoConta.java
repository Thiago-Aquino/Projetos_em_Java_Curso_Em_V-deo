package projetoconta;
import java.util.Scanner;
public class ProjetoConta {
    public static void main(String[] args) {
        
        /*
        Conta c0 = new Conta();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Preencha os dados: ");
        System.out.println("Numero: ");
        int numero = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Nome: ");
        String titular = leitura.nextLine();
        System.out.println("Saldo Inicial: ");
        double saldo = leitura.nextDouble();
        c0.imprime();
        */
        
        
        ContaEmpresa c1 = new ContaEmpresa(452, "Thiago", 500.0f);
        c1.emprestimo(100.0f);
        c1.imprime();
        ContaPoupanca c2 = new ContaPoupanca(752, "Miguel", 400.f);
        c2.saque(200.0f);
        c2.deposito(100.f);
        c2.atualizeSaldo();
        c2.imprime();
        
       
    }
    
}
