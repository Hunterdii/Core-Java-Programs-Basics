import javax.swing.*;
import java.awt.*;

public class SimpleGraphicsApp extends JFrame {

    public SimpleGraphicsApp() {
        setTitle("Simple Graphics Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        add(new DrawingPanel()); // Add a custom JPanel for drawing
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);

            // Draw a red rectangle
            graphics.setColor(Color.RED);
            graphics.fillRect(50, 50, 100, 100);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleGraphicsApp());
    }
}

