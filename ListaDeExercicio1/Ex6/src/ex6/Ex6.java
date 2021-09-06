package ex6;

import javax.swing.*;
import java.awt.*;

public class Ex6 extends JApplet{
    
    public double CelsiusParaFarenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32;
    }
    
    public double FarenheitParaCelsius(double farenheit) {
        return (farenheit - 32) * (5.0 / 9.0);
    }
    
    @Override
    public void paint(Graphics g) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(this, "Conversão de temperaturas\n"
                + "O que deseja fazer?\n"
                + "1- Conversão de Celsius para Farenheit\n"
                + "2- Conversão de Faremheit para Celsius\n"
                + "Digite sua opção: "));
        
        if (op == 1) {
            double grau = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite a temperatura em Celsius: "));
            
            JOptionPane.showMessageDialog(this, String.format("A temperatura %.1f °C corresponde a "
                    + "%.1f °F", grau, CelsiusParaFarenheit(grau)));
        } else if (op == 2) {
            double grau = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite a temperatura em Farenheit: "));
            
            JOptionPane.showMessageDialog(this, String.format("A temperatura %.1f °F corresponde a "
                    + "%.1f °C", grau, FarenheitParaCelsius(grau)));
        } else {
            JOptionPane.showMessageDialog(this, "Opção inválida");
        }
        
        int sair = JOptionPane.showConfirmDialog(this, "Deseja realizar uma nova conversão?");
        
        if (sair != 0) {
            System.exit(0);
        }
    }
}
