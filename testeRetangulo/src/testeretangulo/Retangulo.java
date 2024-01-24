package testeretangulo;

import java.util.Scanner;

public class Retangulo {
    private float base;
    private float altura;
    private boolean quadrado;
    
    public Retangulo(){
        this.base = (float) 1.0;
        this.altura = (float) 2.0;
        this.quadrado = false;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(boolean quadrado) {
        this.quadrado = quadrado;
    }
    
    
    public float area(){
        return this.base * this.altura;
    }
    
    public float perimetro(){
        return this.base*2 + this.altura*2;
        
    }
    
    public void quadrado(){
    if (this.base == this.altura){
        this.setQuadrado(true);
    }else{
        this.setQuadrado(false);
    }
}
     
    
    public void dados(){
    Scanner leitura = new Scanner(System.in);
    System.out.printf("Insira a altura: ");
    altura = leitura.nextInt();
    System.out.printf("Insira a base: ");
    base = leitura.nextInt();
    }
    
    public void exibeDados(){
    System.out.printf("\n============================================");
    System.out.printf("\n Area      : %.2f", area());
    System.out.printf("\n Perimetro : %.2f", perimetro());
    System.out.printf(      "\n Quadrado  : " + this.getQuadrado()); 
    System.out.printf("\n============================================\n"); 
    }
        
    
}

