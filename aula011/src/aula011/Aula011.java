package aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); n posso instanciar classe abstract
        Visitante v1 = new Visitante(); // posso instanciar herança de implementacao
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();// metodo n sobreposto
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();// metodo sobreposto pelo override
    }
    
}
