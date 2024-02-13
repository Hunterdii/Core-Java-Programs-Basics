import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualKeyboardApp extends JFrame implements ActionListener {

    private JTextArea textArea;
    private String[][] keyboardLayout = {
            {"ESC", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "PrtSc", "ScrLk", "Pause"},
            {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "Backspace"},
            {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"},
            {"Caps Lock", "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "Enter"},
            {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/", "Shift"},
            {"Ctrl", "Win", "Alt", "Space", "Alt", "Ctrl", "Left", "Down", "Right"}
    };

    public VirtualKeyboardApp() {
        setTitle("Virtual Keyboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel keyboardPanel = createKeyboardPanel();
        add(keyboardPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createKeyboardPanel() {
        JPanel keyboardPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        for (int row = 0; row < keyboardLayout.length; row++) {
            String[] rowKeys = keyboardLayout[row];
            for (int col = 0; col < rowKeys.length; col++) {
                String key = rowKeys[col];
                JButton button = new JButton(key);
                button.addActionListener(this);
                gbc.gridx = col;
                gbc.gridy = row;
                keyboardPanel.add(button, gbc);
            }
        }

        return keyboardPanel;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Space")) {
            textArea.append(" ");
        } else if (command.equals("Enter")) {
            textArea.append("\n");
        } else if (command.equals("Backspace")) {
            String text = textArea.getText();
            if (!text.isEmpty()) {
                textArea.setText(text.substring(0, text.length() - 1));
            }
        } else {
            textArea.append(command);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VirtualKeyboardApp::new);
    }
}
