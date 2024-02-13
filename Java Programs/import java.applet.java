import java.applet.Applet;
import java.awt.Graphics;

public class ConfigurableApplet extends Applet {
    private String message;

    @Override
    public void init() {
        // Retrieve the "message" parameter from the HTML configuration
        message = getParameter("message");

        if (message == null) {
            message = "Default Message"; // Use a default message if the parameter is not provided
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Message from Configuration: " + message, 50, 50);
    }
}
