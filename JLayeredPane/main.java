package JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String[] args)
    {
        /*
                JLayered pane is a swing container that provides a 3rd dimension for
                positioning components
                example :- depth, Z-index
         */

        JLabel l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        l1.setBounds(50,50,200,200);

        JLabel l2 = new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.green);
        l2.setBounds(100,100,200,200);

        JLabel l3 = new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.blue);
        l3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(l1, Integer.valueOf(0));    // sabse peeche
        layeredPane.add(l3, Integer.valueOf(1));    // sabse aage
        layeredPane.add(l2, Integer.valueOf(2));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
