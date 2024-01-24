package ex03;
public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;
    
    //Construtor
    public Data(int d, int m, int a){
       this.dia = d;
       this.mes = m;
       this.ano = a;
    }
    
    //metodos
    public void Data(int d,int m,int a){
        
    }
    
    public void Data(int m, int a){
        
    }
    
    public void Data(int a){
        
    }
    
    public void setData(int d, int m, int a){
        
    }
    
   public void bissexto(){
       
   }
   
   //metedos abstrados
   public int getDia(){
       return this.dia;
   }
   
   public void setDia(int dia){
       this.dia = dia;
   }
   
   public int getMes(){
       return this.mes;
   }
   
   public void setMes(int mes){
       this.mes = mes;
       if( mes = 4 || mes == 6 || mes == 9 ||  mes == 11){
           System.out.println("O mes possui 30 dias");
           this.mes = mes;
       else if(mes == 1 || mes = 3 || mes = 5 || mes = 7 || mes = 8 || mes = 10 || mes = 12){
           System.out.println("O mes possui 31 dias");
           this.mes = mes;
       }else{
          this.mes = mes; 
       }
       }
   }
   
   public int getAno(){ 
        if(ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0){
            System.out.println("Ano bissexto");
            return this.ano;
        }else{  
            return this.ano;   
           }
   }
   
   public void setAno(int mes){
       this.mes = mes;
   }
}
