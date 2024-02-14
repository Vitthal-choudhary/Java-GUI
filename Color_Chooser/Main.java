package Color_Chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;

    MyFrame()
    {
        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setText("This Is Text");
        label.setFont(new Font("MV Boli",Font.ITALIC,40));

        this.add(button);
        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button)
        {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick color", Color.BLACK);
            label.setForeground(color);
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
