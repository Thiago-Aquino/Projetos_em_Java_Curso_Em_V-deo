package heranca;
public class Pessoa {
    private String nome;
    private int cpf;
    private int rg;
    private int tel;
    
    public Pessoa( String nome, int cpf, int rg, int tel){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
           
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Nome        : " + nome + "\nCPF         : " + cpf + "\nRG          : " + rg + "\nTelefone    : " +tel;
    }
       
}
