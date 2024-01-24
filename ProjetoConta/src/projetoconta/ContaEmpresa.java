package projetoconta;
public class ContaEmpresa extends Conta {
    private float limiteEmprestimo = 500.0f;
    
    public ContaEmpresa(int numero, String titular, float saldo){
       super(numero, titular, saldo);
    }
    
    public void emprestimo(float limiteEmprestimo){
        this.saldo += limiteEmprestimo;
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Limite de Emprestimo: " + getLimiteEmprestimo());
    }

    public float getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(float limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
}
