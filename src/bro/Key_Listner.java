package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Listner extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    Key_Listner(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.addKeyListener(this);

        icon = new ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-run-50.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w' : label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's' : label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd' : label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case 37 : label.setLocation(label.getX()-10,label.getY());
                break;
            case 38 : label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39 : label.setLocation(label.getX()+10,label.getY());
                break;
            case 40 : label.setLocation(label.getX(),label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key char: " + e.getKeyCode());
    }
}
