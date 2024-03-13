package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListner extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon laugh;
    ImageIcon cool;
    ImageIcon confused;
    ImageIcon lovely;
    MouseListner(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        laugh = new ImageIcon("C:\\Users\\Admin\\Downloads\\emoji (1).png");
        cool = new ImageIcon("C:\\Users\\Admin\\Downloads\\cool.png");
        confused = new ImageIcon("C:\\Users\\Admin\\Downloads\\confused.png");
        lovely = new ImageIcon("C:\\Users\\Admin\\Downloads\\emoji.png");

        label.setIcon(laugh);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //System.out.println("you clicked the button");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        //System.out.println("you pressed the button");
        //label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        //System.out.println("you Released the button");
        //label.setBackground(Color.gray);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        //System.out.println("you Entered the button");
        label.setIcon(cool);
    }

    @Override
    public void mouseExited(MouseEvent e) {

        //System.out.println("you Exited the button");
        label.setIcon(confused);
    }
}
