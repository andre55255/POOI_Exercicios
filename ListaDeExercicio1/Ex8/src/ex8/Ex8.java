package ex8;

import javax.swing.*;
import java.awt.*;

public class Ex8 extends JApplet{
    @Override
    public void paint(Graphics g) {
        int[] inputs = new int[15];
        
        for(int i=0; i<inputs.length; i++) {
            inputs[i] = Integer.parseInt(JOptionPane.showInputDialog(this, String.format("Digite o %d° número: ", i+1)));
        }
        
        int fatorMult = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o valor que "
                + "será multiplicado aos valores digitados: "));
        
        
        StringBuilder sb = new StringBuilder();        
        sb.append("Os valores digitados multiplicados por ")
                .append(fatorMult)
                .append(" resultam em:\n");
        
        for(int i=0; i<inputs.length; i++) {
            sb.append(inputs[i] * fatorMult)
                    .append(" ");
        }
        
        JOptionPane.showMessageDialog(this, sb.toString());
        
    }
}
