package projetoconta;
public class Conta {
    //atributos
    protected int numero;
    protected String titular;
    protected float saldo;
    //constructor sem paramentro
    public Conta(){
        numero = 0;
        titular = " ";
        saldo = 0.0f;
    }
    //constructor sobrecarga

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // Métodos publicos
    public void saque(float saque){
        if(saque < 0 ){
            System.out.println("Saldo invalido pra saque");
        }else{
            if(saque > saldo)
                System.out.println("Saldo insuficiente");
            else 
                this.saldo -= saque ;
        }
    }
    
    public void deposito(float deposito){
            this.saldo += deposito;
    }
    
    public void imprime(){
        System.out.println("###Dados da conta###");
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        
    }

    // Métodos abstratos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
