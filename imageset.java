import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.*;


public class imageset {
    public static void main(String[] args) {
        JFrame f = new JFrame("main");
        f.setSize(400,400);
        f.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\ChatGPT Image Mar 31, 2025, 08_43_45 PM.png");
        f.setIconImage(icon);
    }
}
