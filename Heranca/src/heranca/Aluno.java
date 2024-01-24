package heranca;
public class Aluno extends Pessoa {
    private String curso;
    private int matr;
    
    public Aluno(String nome, int cpf, int rg, int tel,String curso, int matr){
        super( nome,  cpf,  rg, tel);
        this.curso = curso;
        this.matr = matr;
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

   public void statusAluno(){
       System.out.println("Curso       : " + this.getCurso());
       System.out.println("Matricula   : " + this.getMatr());
   }
     
}
