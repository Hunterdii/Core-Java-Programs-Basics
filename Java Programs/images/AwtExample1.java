import java.awt.*;
import java.awt.event.*;

public class AwtExample1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Input Example");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        Label nameLabel = new Label("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setForeground(Color.BLUE);

        TextField nameField = new TextField(20);

        Label nicknameLabel = new Label("Nickname:");
        nicknameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nicknameLabel.setForeground(Color.BLUE);

        TextField nicknameField = new TextField(20);

        Button button = new Button("Submit");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLUE);

        Label outputLabel = new Label();
        outputLabel.setAlignment(Label.CENTER);
        outputLabel.setFont(new Font("Arial", Font.BOLD, 14));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String nickname = nicknameField.getText();
                outputLabel.setText("Name: " + name + ", Nickname: " + nickname);
                frame.validate(); // Validate the frame to ensure the updated label is displayed
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(nameLabel, constraints);

        constraints.gridx = 1;
        frame.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(nicknameLabel, constraints);

        constraints.gridx = 1;
        frame.add(nicknameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        frame.add(button, constraints);

        constraints.gridy = 3;
        frame.add(outputLabel, constraints);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}