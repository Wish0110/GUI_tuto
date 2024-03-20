package bro;

import javax.swing.*;
import java.awt.*;

public class D_graphics extends JFrame {

   D_Graphics_panel panel;

    D_graphics(){

        panel = new D_Graphics_panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
