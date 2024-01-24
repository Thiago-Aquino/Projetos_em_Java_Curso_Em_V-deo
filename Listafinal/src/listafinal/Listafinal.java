package listafinal;
public class Listafinal {
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario[] f = new Funcionario[5];
        Programador[] p = new Programador[5];
        Instrutor[] i = new Instrutor[5];
        
        //i[4].setDisciplina("POO"); corrigir os sets 
        //i[2].setDisciplina("PLA");
        
        i[0] = new Instrutor("Grace","Grace.com", 25);
        i[1] = new Instrutor("Grace","Grace.com", 25);
        i[2] = new Instrutor("Grace","Grace.com", 25);
        i[3] = new Instrutor("Grace","Grace.com", 25);
        i[4] = new Instrutor("Grace","Grace.com", 24);
        
        i[0].exibeDados();
        i[1].exibeDados();
        i[2].exibeDados();
        i[3].exibeDados();
        i[4].exibeDados();
    }
    
}
