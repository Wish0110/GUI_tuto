package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class textfield_frame extends JFrame implements ActionListener {

        textfield_frame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            JButton button = new JButton("Submit");
            button.addActionListener(this);

            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(250,40));

            this.add(button);
            this.add(textField);
            this.pack();
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


