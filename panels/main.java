package panels;

import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String[] args)
    {
        // Panel is a GUI component that acts as a container to hold other components

        JLabel label = new JLabel();
        label.setText("Hey Nigga!!");

        JPanel red = new JPanel();
        red.setBackground(Color.red);
        red.setBounds(0,0,250,250);
        JPanel blue = new JPanel();
        blue.setBackground(Color.blue);
        blue.setBounds(250,0,250,250);
        JPanel green = new JPanel();
        green.setBackground(Color.green);
        green.setBounds(0,250,500,250);
        //green.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(red);
        frame.add(blue);
        frame.add(green);
        green.add(label);
    }
}
