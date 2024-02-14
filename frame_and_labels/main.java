// JFrame is a GUI window to which we can add components, basically a screen

package frame_and_labels;

import javax.swing.*;
import java.awt.*;
class Myframe extends JFrame
{
    Myframe()
    {
        this.setSize(420, 420);    // Sets the dimension
        // if we do this.pack() then we don't need size

        this.setResizable(false);      // prevents user to change window size
        this.setTitle("Title Frame");      // this becomes title
        //frame.getContentPane().setBackground(Color.green);  // To change bg color - basic color
        //frame.getContentPane().setBackground(new Color(154,12,152));  // To change bg color - rgb
        this.getContentPane().setBackground(new Color(0x123456));  // To change bg color

        // For logo
        ImageIcon logo = new ImageIcon("frame_and_labels/logo.png");     // Creates an image icon
        this.setIconImage(logo.getImage());        // puts the logo image on icon

        // the application even after closing does not kill the program to do that
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // making labels
        JLabel label = new JLabel();        // we can write hey nigga here also
        label.setText("Hey Nigga");
        this.add(label);

        this.setVisible(true);     // to make frame visible
    }

}
public class main
{
    public static void main(String[] args)
    {
        Myframe root = new Myframe();
    }
}
