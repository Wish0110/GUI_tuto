package bro;

import javax.swing.*;

public class popup_dialogbox {
    public static void main(String[] args){

        //popup standerd dialog box
        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more useless info","title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Realy?","title",JOptionPane.QUESTION_MESSAGE);
        //while (true){
        //JOptionPane.showMessageDialog(null,"You're a virus!!!","title",JOptionPane.WARNING_MESSAGE);}
        //JOptionPane.showMessageDialog(null,"Call 119 now!!!!","title",JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello "+ name);

        JOptionPane.showOptionDialog(null, "baby, you are awesome!!!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
    }

}
