package bro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class drag_and_drop2 extends JPanel {

    ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Downloads\\icons8-star-filled-48.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageConer;
    Point prevPt;

    drag_and_drop2(){

        imageConer = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageConer.getX(), (int)imageConer.getY());
    }

    private class ClickListener  extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            prevPt =e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            imageConer.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())

            );
            prevPt = currentPt;
            repaint();
        }
    }
}
