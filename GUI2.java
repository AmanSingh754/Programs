import javax.swing.*;
import java.awt.event.*;

public class GUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CUSAT CAT PG Admission Form");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);
        frame.add(nameLabel);
        frame.add(nameField);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 70, 100, 25);
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 70, 200, 60);
        frame.add(addressLabel);
        frame.add(addressArea);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 150, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(150, 150, 70, 25);
        female.setBounds(220, 150, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        // Preferred Courses
        JLabel courseLabel = new JLabel("Preferred Courses:");
        courseLabel.setBounds(30, 190, 150, 25);
        JCheckBox course1 = new JCheckBox("M.Tech");
        JCheckBox course2 = new JCheckBox("M.Sc");
        JCheckBox course3 = new JCheckBox("MBA");
        course1.setBounds(150, 190, 80, 25);
        course2.setBounds(230, 190, 80, 25);
        course3.setBounds(310, 190, 80, 25);
        frame.add(courseLabel);
        frame.add(course1);
        frame.add(course2);
        frame.add(course3);

        // Preferred District
        JLabel districtLabel = new JLabel("Preferred District:");
        districtLabel.setBounds(30, 230, 150, 25);
        String[] districts = {"Ernakulam", "Kozhikode", "Thrissur", "Kottayam", "Trivandrum"};
        JComboBox<String> districtBox = new JComboBox<>(districts);
        districtBox.setBounds(150, 230, 200, 25);
        frame.add(districtLabel);
        frame.add(districtBox);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(30, 270, 100, 25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 270, 200, 25);
        frame.add(phoneLabel);
        frame.add(phoneField);

        // Email Address
        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(30, 310, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 310, 200, 25);
        frame.add(emailLabel);
        frame.add(emailField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(180, 360, 100, 30);
        frame.add(submitButton);

        // Action Listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not selected");
                String courses = "";
                if (course1.isSelected()) courses += "M.Tech ";
                if (course2.isSelected()) courses += "M.Sc ";
                if (course3.isSelected()) courses += "MBA ";
                String district = (String) districtBox.getSelectedItem();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String message = "Name: " + name + "\n"
                        + "Address: " + address + "\n"
                        + "Gender: " + gender + "\n"
                        + "Preferred Courses: " + courses + "\n"
                        + "Preferred District: " + district + "\n"
                        + "Phone: " + phone + "\n"
                        + "Email: " + email;

                JOptionPane.showMessageDialog(frame, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
