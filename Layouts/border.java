package Layouts;

import javax.swing.*;
import java.awt.*;

public class border
{
    public static void main(String[] args)
    {
        /*
        Layout Manager defines the natural layout for components within container
        common managers are:
            1.Border Layout - it places components in 5 areas: NORTH, SOUTH, WEST, EAST, CENTER.
                                All extra space is placed in center area.
         */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(new BorderLayout());    // Border layout is default anyway
        frame.setLayout(new BorderLayout(10,10));    // to give margin gap between panels
        frame.setVisible(true);

        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();
        JPanel pan4 = new JPanel();
        JPanel pan5 = new JPanel();

        pan1.setBackground(Color.red);
        pan2.setBackground(Color.green);
        pan3.setBackground(Color.yellow);
        pan4.setBackground(Color.magenta);
        pan5.setBackground(Color.blue);

        pan1.setPreferredSize(new Dimension(100,100));
        pan2.setPreferredSize(new Dimension(100,100));
        pan3.setPreferredSize(new Dimension(100,100));
        pan4.setPreferredSize(new Dimension(100,100));

        pan5.setPreferredSize(new Dimension(100,100));

        // Sub panels in panels

        JPanel pan6 = new JPanel();
        JPanel pan7 = new JPanel();
        JPanel pan8 = new JPanel();
        JPanel pan9 = new JPanel();
        JPanel pan10 = new JPanel();

        pan6.setBackground(Color.black);
        pan7.setBackground(Color.darkGray);
        pan8.setBackground(Color.gray);
        pan9.setBackground(Color.lightGray);
        pan10.setBackground(Color.white);

        pan5.setLayout(new BorderLayout()); // by default panels use flow layout

        pan6.setPreferredSize(new Dimension(100,100));
        pan7.setPreferredSize(new Dimension(100,100));
        pan8.setPreferredSize(new Dimension(100,100));
        pan9.setPreferredSize(new Dimension(100,100));
        pan10.setPreferredSize(new Dimension(100,100));

        pan5.add(pan6, BorderLayout.NORTH);
        pan5.add(pan7, BorderLayout.SOUTH);
        pan5.add(pan8, BorderLayout.EAST);
        pan5.add(pan9, BorderLayout.WEST);
        pan5.add(pan10, BorderLayout.CENTER);

        frame.add(pan1, BorderLayout.NORTH);
        frame.add(pan2, BorderLayout.WEST);
        frame.add(pan3, BorderLayout.EAST);
        frame.add(pan4, BorderLayout.SOUTH);
        frame.add(pan5, BorderLayout.CENTER);
    }
}
