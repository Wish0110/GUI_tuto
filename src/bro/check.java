package bro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class check {

    private JPanel colorBox;
    private JComboBox<String> colorSelector;

    public check() {
        createUI();
    }

    private void createUI() {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorBox = new JPanel();
        colorBox.setPreferredSize(new Dimension(200, 200));

        colorSelector = new JComboBox<>(new String[]{"Black", "Red", "Pink"});
        colorSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColor();
            }
        });

        // Create a horizontal layout manager
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(colorSelector, BorderLayout.WEST);
        centerPanel.add(colorBox, BorderLayout.EAST);

        // Set frame size and minimum size
        frame.setSize(900, 600);
        frame.setMinimumSize(new Dimension(900, 600));

        // Add center panel to the frame
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

        updateColor();// Set initial color
    }

    private void updateColor() {
        String selectedColor = (String) colorSelector.getSelectedItem();
        Color color = Color.white; // Default color
        switch (selectedColor) {
            case "Black":
                color = Color.black;
                break;
            case "Red":
                color = Color.RED;
                break;
            case "Pink":
                color = Color.PINK;
                break;
        }
        colorBox.setBackground(color);
    }
}