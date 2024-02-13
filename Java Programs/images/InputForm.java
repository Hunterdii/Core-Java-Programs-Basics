import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm {
    private JFrame frame;
    private JTextField nameField;
    private JTextField enrollmentField;
    private JLabel outputLabel;

    public InputForm() {
        frame = new JFrame("Input Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Enrollment No:"));
        enrollmentField = new JTextField();
        panel.add(enrollmentField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String enrollment = enrollmentField.getText();
                outputLabel.setText("Name: " + name + ", Enrollment No: " + enrollment);
            }
        });
        panel.add(submitButton);

        outputLabel = new JLabel();
        panel.add(outputLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new InputForm();
    }
}