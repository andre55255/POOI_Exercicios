package Ex2;

import javax.swing.*;
import java.awt.*;

public class Applet extends JApplet{
    
    @Override
    public void paint(Graphics g) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite o 1° número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite o 2° número: "));
        
        String res = String.format(""
                + "%.1f + %.1f = %.1f"
                + "\n"
                + "%.1f - %.1f = %.1f"
                + "\n"
                + "%.1f * %.1f = %.1f"
                + "\n"
                + "%.1f / %.1f = %.1f",
                num1, num2, (num1 + num2),
                num1, num2, (num1 - num2),
                num1, num2, (num1 * num2),
                num1, num2, (num1 / num2));
        
        JOptionPane.showMessageDialog(this, res);
    }
}
