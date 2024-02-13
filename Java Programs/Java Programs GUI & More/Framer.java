import javax.swing.*;
import java.awt.*;

public class Framer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Framer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(2, 1));

        JPanel top = new JPanel(new GridLayout(1, 2));
        JPanel topg = new JPanel(new GridLayout(3, 1));
        JPanel topzz = new JPanel(new GridLayout(1, 3));

        JPanel bot = new JPanel(new GridLayout(3, 1));
        JPanel bott = new JPanel(new GridLayout(1, 4));
        JPanel botg = new JPanel(new FlowLayout());
        JPanel bottomg = new JPanel(new BorderLayout());

        // Set background colors
        top.setBackground(Color.BLUE);
        topg.setBackground(Color.YELLOW);
        topzz.setBackground(Color.CYAN);
        bot.setBackground(Color.RED);
        bott.setBackground(Color.ORANGE);
        botg.setBackground(Color.PINK);
        bottomg.setBackground(Color.GREEN);

        JButton shirtButton = new JButton("Shirt");
        shirtButton.setBackground(Color.MAGENTA);
        top.add(shirtButton);

        top.add(topg);
        topg.add(new JButton("Accessories"));
        topg.add(new JButton("Perfumes"));
        topg.add(new JButton("Cosmetics"));
        topg.add(topzz);
        topzz.add(new JButton("GOLD"));
        topzz.add(new JButton("CASH"));
        topzz.add(new JButton("CARDS"));

        bot.add(bott);
        bott.add(new JButton("FORMALS"));
        bott.add(new JButton("SHIRTS"));
        bott.add(new JButton("TRADITIONALS"));
        bott.add(new JButton("PANTS"));

        bot.add(botg);
        botg.add(new JButton("JEANS,TRACKS"));
        bot.add(bottomg);
        bottomg.add(new JButton("WEST"), BorderLayout.WEST);
        bottomg.add(new JButton("EAST"), BorderLayout.EAST);

        frame.add(top);
        frame.add(bot);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
};
