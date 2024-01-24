package aula011;
public class tecnico extends Aluno {
    private String registroProfissional;
    
    public void praticar(){
        System.out.println( getNome() + " praticando ");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
