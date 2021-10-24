package entities;

import javax.swing.JOptionPane;

public class AgeSleep {
    private int age;
    
    public AgeSleep() {
    }
    
    public AgeSleep(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public double timeSleeping() {
        double result = 0;
        
        try {
            result = this.age / 3.0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Divisão inválida por zero", "Erro", JOptionPane.WARNING_MESSAGE);
            return 0;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Número inválida", "Erro", JOptionPane.WARNING_MESSAGE);
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro nao identificado", "Erro", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
        
        return result;
    }
}