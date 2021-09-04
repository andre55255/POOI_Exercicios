package desenho;

import javax.swing.*;
import java.awt.*;

public class jApplet extends JApplet {
    @Override
    public void paint(Graphics g) {
        
        g.drawOval(10, 10, 50, 50);
        
        g.setColor(Color.GREEN);
        g.fillOval(30, 20, 30, 30);
        
        g.setColor(Color.BLACK);
        g.drawOval(70, 10, 50, 50);
        
        g.setColor(Color.ORANGE);
        g.fillOval(70, 20, 30, 30);
        
        g.setColor(Color.BLACK);
        g.fillRect(54, 60, 20, 20);
        
        g.setColor(Color.RED);
        g.fillRect(24, 88, 85, 10);
        
    }
}