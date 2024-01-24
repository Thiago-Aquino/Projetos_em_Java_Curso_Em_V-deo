package projetoanimalaula12;
public class Canguru extends Mamifero {
    @Override // sobreposicao do locomover da classe Mamifero(herdada)
    public void locomover(){
        System.out.println("Saltando");
    }
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
}
