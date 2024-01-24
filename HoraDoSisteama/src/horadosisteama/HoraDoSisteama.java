package horadosisteama;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSisteama {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora do sistema : ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.println("Idioma do sistema : ");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolucao do sistema : " + d.width + " X " + d.height);
    }
    
}
