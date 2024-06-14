import java.awt.event.ActionEvent;
import javax.swing.*;

public class GreetingApp {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Greeting App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create and add a JLabel for the name
        JLabel nameLabel = new JLabel("Enter your name:");
        panel.add(nameLabel);

        // Create and add a JTextField for the name input
        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        // Create and add a JLabel for the age
        JLabel ageLabel = new JLabel("Enter your age:");
        panel.add(ageLabel);

        // Create and add a JTextField for the age input
        JTextField ageField = new JTextField(5);
        panel.add(ageField);

        // Create and add a JButton
        JButton button = new JButton("Submit");
        panel.add(button);

        // Create a JLabel for displaying the greeting message
        JLabel messageLabel = new JLabel("");
        panel.add(messageLabel);

        // Add an ActionListener to the button to handle button clicks
        button.addActionListener((ActionEvent e) -> {
            // Get the name and age from the text fields
            String name = nameField.getText();
            String age = ageField.getText();
            
            // Display a greeting message
            messageLabel.setText("Hello " + name + "! You are " + age + " years old.");
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
