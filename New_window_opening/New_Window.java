package New_window_opening;

import javax.swing.*;
import java.awt.*;

public class New_Window
{
    JFrame root = new JFrame();
    JLabel label = new JLabel("Hello!!");
    New_Window()
    {
        label.setBounds(0,0,200,50);
        label.setFont(new Font(null, Font.PLAIN, 30));
        label.setBackground(Color.BLUE);
        label.setForeground(Color.red);

        root.add(label);

        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setSize(500,500);
        root.setLayout(null);
        root.setVisible(true);
    }
}
