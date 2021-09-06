package ex3;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 a 10: "));
        
        int op = JOptionPane.showConfirmDialog(null, String.format("Você digitou %d\nDeseja continuar?", n));

        if (op == 0) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}