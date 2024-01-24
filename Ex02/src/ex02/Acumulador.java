package ex02;
public class Acumulador {
        private float soma = 0;
    private int contagem = 0;
    
    public Acumulador(float soma, int contagem){
        this.soma = soma;
        this.contagem = contagem;
    }    

    public void totalize(float valor){
        soma += valor;
        contagem++;
    }

    public float informeTotal(){
        return this.soma;
    }

    public int informeContagem(){
        return this.contagem;
    }

    public float forneceMedia(){
        return this.soma / this.contagem;
    } 
    
    public void status(){
        System.out.println("Total    : " + this.informeTotal());
        System.out.println("Contagem : " + this.informeContagem());
        System.out.println("Media    : " + this.forneceMedia());
    }

    public Float getSoma(){
        return this.soma;
    }

    public void setSoma(float soma){
        this.soma = soma;
    }

    public int getContagem(){
        return this.contagem;
    }

    public void setaContagem(int contagem){
        this.contagem = contagem;
    }
    
}
