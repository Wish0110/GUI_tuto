package bro;


import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Downloads\\OIP (14).jfif");

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900,900);
        frame.setVisible(true);
        frame.add(label);

       /* JFrame frame = new JF rame();
        frame.setTitle("Jframe title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Downloads\\logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));*/

       // MyFrames myFrames = new MyFrames();
    }
}