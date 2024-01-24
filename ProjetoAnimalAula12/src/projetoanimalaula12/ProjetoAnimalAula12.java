package projetoanimalaula12;
public class ProjetoAnimalAula12 {
    public static void main(String[] args) {
        //Animal n = new Animal(); "nao posso instanciar um objeto de classe abstrata!!!!"
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        k.emitirSom();
        c.emitirSom();
        
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
    }
    
}
