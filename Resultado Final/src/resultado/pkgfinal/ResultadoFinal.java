
package resultado.pkgfinal;

import javax.swing.JOptionPane;

public class ResultadoFinal {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, s = 0, p = 0, i =0, cem = 0, m, a =0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        s += n;
        if (n % 2 == 0){
           p++;
        } else{
           i++; 
        }
        if(n > 100){
            cem++;
        }
        a++;
        } while ( n != 0);
        m = s / a;
        JOptionPane.showMessageDialog(null, "<html>Resultado:  <hr>" + "<br> Total de valores:  " + s + "<br>Total de Pares: " + (p-1) + "<br>Total de impares: " + i + "<br>Acima de 100: " + 
                cem + "<br>Media de valores: " + m + "</html>");
    }
    
}
