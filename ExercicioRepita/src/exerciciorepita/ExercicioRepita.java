
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        s += n;
        } while ( n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatorio vale  " + s + "</html>");
    }
    
}
