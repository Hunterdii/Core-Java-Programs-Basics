import java.awt.*;
import java.awt.event.*;

public class Awt {
    public static void main(String[] args) {
        Frame frame = new Frame("Input Example");

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 100, 80, 30);

        TextField nameField = new TextField();
        nameField.setBounds(130, 100, 200, 30);

        Label nicknameLabel = new Label("Nickname:");
        nicknameLabel.setBounds(50, 150, 80, 30);

        TextField nicknameField = new TextField();
        nicknameField.setBounds(130, 150, 200, 30);

        Button button = new Button("Submit");
        button.setBounds(50, 200, 80, 30);

        Label outputLabel = new Label();
        outputLabel.setBounds(50, 250, 300, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String nickname = nicknameField.getText();
                outputLabel.setText("Name: " + name + ", Nickname: " + nickname);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(nicknameLabel);
        frame.add(nicknameField);
        frame.add(button);
        frame.add(outputLabel);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}