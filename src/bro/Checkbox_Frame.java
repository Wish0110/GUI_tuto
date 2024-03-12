package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox_Frame extends JFrame implements ActionListener {

    Checkbox_Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
