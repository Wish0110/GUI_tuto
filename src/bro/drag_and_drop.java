package bro;

import javax.swing.*;

public class drag_and_drop extends JFrame {

    drag_and_drop2 dragPanel = new drag_and_drop2();
    drag_and_drop(){

        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
