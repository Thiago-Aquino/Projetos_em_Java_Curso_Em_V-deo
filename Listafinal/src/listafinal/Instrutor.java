package listafinal;
public class Instrutor extends Funcionario {
    private String disciplina;
    
    public Instrutor(String nome, String email, int idade){
        super(nome, email, idade);
    }
    
    public void setDisciplina(String disciplina){
        disciplina = this.disciplina;
    }
    
    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Disciplina: " + this.disciplina);
    }
}
