import javax.swing.*;
import java.awt.*;

public class Wardrobe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wardrobe");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel sub = new JPanel(new GridLayout(2,2));
        JPanel top = new JPanel(new GridLayout(1,2));
        JPanel topr = new JPanel(new GridLayout(3,1));
        JPanel toprb = new JPanel(new GridLayout(1,3));

        JPanel bot = new JPanel(new GridLayout(3,1));
        JPanel bott = new JPanel(new GridLayout(1,4)); 
        JPanel botm = new JPanel(new FlowLayout());
        JPanel botg = new JPanel(new BorderLayout());

        top.add(new JButton("Shirt"));
        top.add(topr);
        topr.add(new JButton("Perfume"));
        topr.add(new JButton("Cream"));
        topr.add(toprb);
        toprb.add(new JButton("Gold"));
        toprb.add(new JButton("Diamond"));
        toprb.add(new JButton("Cards"));

        bot.add(bott);
        bott.add(new JButton("Shirt"));
        bott.add(new JButton("Pants"));
        bott.add(new JButton("Shirt")); 
        bott.add(new JButton("Pants")); 
        bot.add(botm);
        botm.add(new JButton("Clothes")); 
        bot.add(botg);
        botg.add(new JButton("Shorts"), BorderLayout.WEST); 
        botg.add(new JButton("T-shirt"), BorderLayout.EAST);

        sub.add(top);
        sub.add(bot);

        frame.add(sub);
        frame.setVisible(true);
    }
}
