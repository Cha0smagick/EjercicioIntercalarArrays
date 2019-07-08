
package usoarrayejemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * @author 999Cha0smagick666
 */
public class UsoArrayEjemplo {
    
    
    public static void main(String[] args) {
        List<String> conjunto1 = new ArrayList<>();
        List<String> conjunto2 = new ArrayList<>();
        List<String> conjunto3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        String captura = JOptionPane.showInputDialog("inserte el "+i+" numero");
        conjunto1.add(captura);
           
        }
        for (int i = 0; i < 3; i++) {
            String captura = JOptionPane.showInputDialog("inserte el "+i+" numero");
        conjunto2.add(captura);
            
        }
       

        for (int i = 0; i < 3; i++) {
           conjunto3.add(conjunto1.get(i));
           conjunto3.add(conjunto2.get(i));
        }

            JOptionPane.showMessageDialog(null,conjunto3);
        
    }
}
