import java.awt.*;

public class AwtExample{
    public static void main(String[] args) {
        Frame frame = new Frame("Notebook");

        Label firstLabel = new Label("Het");
        firstLabel.setBounds(50,100,100,30);

        Label secondLabel = new Label("NOTE BOOK");
        secondLabel.setBounds(50,150,100,30);

        frame.add(firstLabel);
        frame.add(secondLabel);
        //        frame.setSize(400, 200); //width and height of the window in pixels (px).
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}