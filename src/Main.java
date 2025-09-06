import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {

    // Methods and classes used to build dynamic fullscreen window.
    static Toolkit tk = Toolkit.getDefaultToolkit();
    static Dimension screenSize = tk.getScreenSize();
    public static int setHeight() {
        double height = tk.getScreenSize().getHeight();
        return (int) height;
    }
    public static int setWidth() {
        double width = tk.getScreenSize().getWidth();
        return (int) width;
    }

    public static void main(String[] args) {

        // Creates fullscreen window and defines closing behavior.
        int width = setWidth();
        int height = setHeight();
        JFrame frame = new JFrame("GAMERS PROJECT");
        frame.setSize(width, height);
        ImageIcon img = new ImageIcon("src/images/PixelArtTutorial.png");
        JLabel label = new JLabel(img);
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}