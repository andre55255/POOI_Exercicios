package ex5;

import javax.swing.*;
import java.awt.*;

public class Ex5 extends JApplet{
    
    public double Hipotenusa(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    @Override
    public void paint(Graphics g) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(this, "Cálculo da hipotenusa\nDigite o 1° cateto: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(this, "Cálculo da hipotenusa\nDigite o 2° cateto: "));
        
        double h = Hipotenusa(a, b);
        
        JOptionPane.showMessageDialog(this, String.format("Dados os catetos digitados:\n"
                + "%.1f e %.1f,\n"
                + "a hipotenusa é igual a %f", a, b, h));
    }
}
