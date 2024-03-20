package bro;

import javax.swing.*;
import java.awt.*;

public class D_Graphics_panel extends JPanel {

    D_Graphics_panel(){

        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.red);
        g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);

        g2D.drawRect(0,0,100,100);
    }
}
