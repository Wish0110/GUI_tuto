package bro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.*;

public class check {

    private JPanel colorBox;
    private JComboBox<String> colorSelector;
    private JLabel backgroundLabel;

    public check() {
        createUI();
    }

    private void createUI() {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorBox = new JPanel();
        colorBox.setPreferredSize(new Dimension(100, 100));

        colorSelector = new JComboBox<>(new String[]{"Black", "Red", "Pink"});
        colorSelector.setPreferredSize(new Dimension(200, 30));
        colorSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColor();
            }
        });

        // Create a horizontal layout manager
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Center components horizontally
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;

        ImageIcon backgroundImage = null;
        try {
            backgroundImage = new ImageIcon(ImageIO.read(new File("backgroundimg1.png")));
        } catch (Exception e) {
            // Handle potential exceptions like file not found
            System.err.println("Error loading background image: " + e.getMessage());
        }

        // Create a label to display the background image
        backgroundLabel = new JLabel(backgroundImage);

        // Set the label to cover the entire frame (adjust as needed)
        backgroundLabel.setSize(frame.getWidth(), frame.getHeight());

        // Add combobox
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(colorSelector, gbc);

        gbc.insets = new Insets(0, 200, 0, 0);
        // Add color box below combobox
        gbc.gridx = 1;
        frame.add(colorBox, gbc);

        frame.setSize(900, 600);
        frame.setMinimumSize(new Dimension(900, 600));
        frame.setVisible(true);

        updateColor();  // Set initial color
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
