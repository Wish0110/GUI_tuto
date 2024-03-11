package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    button(){

        ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Downloads\\user.png");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-star-filled-48.png");

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(100,150,100,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener((ActionListener) this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.orange);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            //System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
