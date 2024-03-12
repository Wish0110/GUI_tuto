package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class textfield_frame extends JFrame implements ActionListener {

        JButton button;
        JTextField textField;
        textfield_frame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            button = new JButton("Submit");
            button.addActionListener(this);

            textField = new JTextField();
            textField.setPreferredSize(new Dimension(250,40));
            textField.setFont(new Font("Consolas",Font.PLAIN,35));
            textField.setForeground(new Color(0x00ff00));
            textField.setBackground(Color.black);
            textField.setCaretColor(Color.white);


            this.add(button);
            this.add(textField);
            this.pack();
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){
                System.out.println("Welcome "+ textField.getText());

            }
        }
    }


