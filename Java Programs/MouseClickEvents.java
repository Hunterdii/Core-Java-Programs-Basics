import java.awt.event.*;
import javax.swing.*;

public class MouseClickEvents implements MouseListener {

    public static void main(String[] args) {
        // Create a JFrame to hold the panel
        JFrame frame = new JFrame("Mouse Click Events Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel and add it to the frame
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Add a MouseListener to the JFrame
        frame.addMouseListener(new MouseClickEvents());

        // Set the size of the frame
        frame.setSize(400, 400);

        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("Left button clicked");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("Right button clicked");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Do nothing
    }
}