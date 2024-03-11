package bro;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Downloads\\Screenshot__167_-removebg-preview.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff50));
        label.setBackground(new Color(0x123456));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setLayout(null);
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