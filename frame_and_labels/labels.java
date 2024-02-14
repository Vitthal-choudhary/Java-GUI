package frame_and_labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels
{
    public static void main(String[] args)
    {
        JFrame root = new JFrame();
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
        root.setTitle("Coding Nigga");
        root.setSize(500, 500);
        //root.pack();      // put this after adding all components
        root.setLayout(null);   // now default layout is disabled and we can limit the label

        JLabel l1 = new JLabel();
        l1.setBounds(0,0,550,550);  // bounds of the label
        l1.setText("Hey Nigga");    // to add text label
        root.add(l1);
        ImageIcon img = new ImageIcon("frame_and_labels/logo.png");
        l1.setIcon(img);    // to set img label

        Border border = BorderFactory.createLineBorder(Color.cyan, 3);

        l1.setHorizontalTextPosition(JLabel.CENTER);    // LEFT, CENTER RIGHT OF IMAGE
        l1.setVerticalTextPosition(JLabel.TOP);         // TOP/ CENTER OR BOTTOM
        l1.setForeground(Color.green);      // font color
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));      // font
        l1.setIconTextGap(1);   // icon and text gap

        l1.setBackground(Color.PINK);   // set bg
        l1.setOpaque(true);     // required for bg

        l1.setBorder(border);

        l1.setVerticalAlignment(JLabel.CENTER);        // sets vertical position of icon +text
        l1.setHorizontalAlignment(JLabel.CENTER);       // sets horizontal
    }
}
