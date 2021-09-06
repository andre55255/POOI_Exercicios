package ex4;

import javax.swing.*;
import java.awt.*;

public class Ex4 extends JApplet{
    @Override
    public void paint(Graphics g) {
        float a = Float.parseFloat(JOptionPane.showInputDialog(this, "Dada a equação do segundo grau:\nax² + bx + c = 0\nDigite a: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog(this, "Dada a equação do segundo grau:\nax² + bx + c = 0\nDigite b: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog(this, "Dada a equação do segundo grau:\nax² + bx + c = 0\nDigite c: "));
    
        float delta = (float) Math.pow(b, 2) - 4 * a * c;
        float x1 = (float) ((-1*b) + (Math.sqrt(delta))) / (2 * a);
        float x2 = (float) ((-1*b) - (Math.sqrt(delta))) / (2 * a);
        
        JOptionPane.showMessageDialog(this, String.format("Dada a equação digitada:"
                + "\n"
                + "%.1fx² + %.1fx + %.1f"
                + "\n"
                + "As raízes da equação são:"
                + "\n"
                + "x1 = %.1f e x2 = %.1f", a, b, c, x1, x2));
    }
}