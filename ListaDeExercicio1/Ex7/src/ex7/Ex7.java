package ex7;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String[] args) {
        
        int[] inputs = new int[10];
        
        for (int i=0; i<inputs.length; i++) {
            inputs[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° número", i+1)));
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Impressão dos valores digitados em ordem inversa\n");
        
        for (int i=inputs.length-1; i>=0; i--) {
            sb.append(inputs[i])
               .append(" ");
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}