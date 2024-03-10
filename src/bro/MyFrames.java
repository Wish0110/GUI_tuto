package bro;

import javax.swing.*;
import java.awt.*;

public class MyFrames extends JFrame {

    MyFrames(){

        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Downloads\\logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
