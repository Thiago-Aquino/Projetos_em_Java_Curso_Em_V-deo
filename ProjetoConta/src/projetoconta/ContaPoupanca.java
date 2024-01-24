package projetoconta;
public class ContaPoupanca extends Conta {
    private float taxaJuros = 0.01f;

    public ContaPoupanca(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }
    
    public void atualizeSaldo(){
        saldo += saldo * taxaJuros;
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Taxa juros: " + getTaxaJuros());
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
}
