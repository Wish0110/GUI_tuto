package bro;

import javax.swing.*;

public class progress_bar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    progress_bar(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){

    }
}
