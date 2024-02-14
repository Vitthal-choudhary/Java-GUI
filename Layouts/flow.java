package Layouts;

import javax.swing.*;
import java.awt.*;

public class flow
{
    public static void main(String[] args)
    {
        /*
            2. Flow layout - places components in a row, sized at their preferred size.
                               if horizontal space in container is too small, flow layout
                                class uses next available row
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20,10));
        /*
        leading sticks them to left side
        trailing sets them to right side

        hgap and vgap is margins of buttons
         */

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.blue);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true);
    }
}
