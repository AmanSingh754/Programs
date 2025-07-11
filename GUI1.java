import javax.swing.*;
import java.awt.event.*;

public class GUI1 {
    public static void main(String[] args) {
        // Create a new frame (window)

        JFrame frame = new JFrame("My First GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Absolute layout

        // Create a label
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(30, 30, 120, 25);
        frame.add(label);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 100, 25);
        frame.add(textField);

        // Create a button
        JButton button = new JButton("Greet");
        button.setBounds(100, 80, 80, 30);
        frame.add(button);

        // Create an action listener for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
