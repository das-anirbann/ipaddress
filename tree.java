import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree {
    public static void main(String[] args) {


        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setVisible(true);


        DefaultMutableTreeNode style= new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");

        color.add(red);
        color.add(blue);
        color.add(green);
       
        JTree jt = new JTree(style);
        f.add(jt);

    }
}
