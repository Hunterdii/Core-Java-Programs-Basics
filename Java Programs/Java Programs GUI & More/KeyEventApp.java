import javax.swing.*;
import java.awt.event.*;

public class KeyEventApp extends JFrame implements KeyListener {

    private JTextArea eventLog; // Declare the JTextArea
    private JFrame frame; // Declare the JFrame

    public KeyEventApp() {
        frame = this; // Set the frame to the current instance (this)
        frame.setTitle("Typing Tutor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected the constant name
        frame.setSize(400, 200);

        eventLog = new JTextArea();
        eventLog.setEditable(true); // Set the JTextArea to be editable
        eventLog.addKeyListener(this);

        JScrollPane scrollPane = new JScrollPane(eventLog);
        frame.getContentPane().add(scrollPane);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        logEvent("Key typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        logEvent("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode())); // Corrected the method name getKeyCode()
    }

    public void keyReleased(KeyEvent e) {
        logEvent("Key released: " + KeyEvent.getKeyText(e.getKeyCode())); // Corrected the method name getKeyCode()
    }

    private void logEvent(String message) {
        eventLog.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KeyEventApp();
            }
        });
    }
}
