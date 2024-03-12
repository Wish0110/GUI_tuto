package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox_Frame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    Checkbox_Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-x-64.png");
        checkIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-check-50.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.HANGING_BASELINE,35));
        checkBox.setIcon(xIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
