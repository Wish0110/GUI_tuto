package bro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener{

    JButton button;
    myFrame(){

        ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Downloads\\user.png");

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener((ActionListener) this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("poo");
        }
    }
}
