import java.awt.event.*;
import javax.swing.*;

public class KeyboardEvents implements KeyListener {

    public static void main(String[] args) {
        // Create a JFrame to hold the panel
        JFrame frame = new JFrame("Keyboard Events Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and add it to the frame
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Add a KeyListener to the panel
        panel.addKeyListener(new KeyboardEvents());

        // Set the focus on the panel to receive key events
        panel.setFocusable(true);

        // Set the size of the frame
        frame.setSize(400, 400);

        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }
}
