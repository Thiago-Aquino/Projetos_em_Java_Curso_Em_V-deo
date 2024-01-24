package listafinal;
public class Programador extends Funcionario {
    private String linguagem;
    private String sisOper;
    
    public Programador(String nome,String email, int idade){
        super(nome, email, idade);
    }
    
    public void setLinguagem(String ling){
        ling = this.linguagem;
    }
    
    public void setSO(String sisOper){
        sisOper= this.sisOper;
    }
    
    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Linguagem: " + this.linguagem);
        System.out.println("Sistema operacional: " +this.sisOper);
    }
}
