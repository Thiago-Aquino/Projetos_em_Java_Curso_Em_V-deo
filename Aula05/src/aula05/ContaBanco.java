package aula05;
public class ContaBanco {
    //Atributos
    public  int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC"){
            //this.saldo = this.saldo + 50;
            this.setSaldo(50);
        }else if (t == "CP"){
            //this.saldo = this.saldo + 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta debitada");
        }
        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada!");          
        }
       // if (this.status = true){
       //     this.saldo = this.saldo + v;
       // }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
        //if (this.status = true & this.saldo > 0){
        //    this.saldo = this.saldo - v;
        //}
        //else{
        //    System.out.println("Saldo insuficiente ou conta fechada");
        //}
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mesalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta fechada!");
        }
       
        
        //if (this.tipo == CC){
        //    this.saldo = this.saldo - 12.0f;
        //}
        //else if(this.tipo == CP){
        //    this.saldo = this.saldo - 20.0f;
        //}
    }
    //Metodos especiais
    public ContaBanco(){
        this.saldo = 0.0f;
        //this.setSaldo(0);
        this.status = false;
        //this.setStatus(false);
    }
    
    public ContaBanco(int numConta,  String dono){
        this.numConta = numConta;
        this.dono = dono;
        
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
