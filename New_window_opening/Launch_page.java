package New_window_opening;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launch_page implements ActionListener
{
    JFrame frame = new JFrame();
    JButton butt = new JButton("Click Me");
    Launch_page()
    {
        butt.setBounds(100,100,200,50);
        butt.setFocusable(false);
        butt.addActionListener(this);

        frame.add(butt);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==butt)
        {
            frame.dispose();        // delete the first screen and keep the new one running. so more windows don't open.
            New_Window my_new_screen = new New_Window();
        }

    }
}
