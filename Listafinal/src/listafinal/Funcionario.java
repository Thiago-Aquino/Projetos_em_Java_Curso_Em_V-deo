package listafinal;
public class Funcionario {
    protected String nome;
    protected String email;
    protected int idade;

    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public Funcionario(String nome,String email, int idade){
        this.nome = nome;
        this.email = email;
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Idade: " + this.idade);
    }
    
}
