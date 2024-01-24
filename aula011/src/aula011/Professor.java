package aula011;
public class Professor extends Pessoa {
    private String espacialidade;
    private float salario;
    
   public  void receberAumento(){
        this.salario++;
    }

    public String getEspacialidade() {
        return espacialidade;
    }

    public void setEspacialidade(String espacialidade) {
        this.espacialidade = espacialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
   
}
