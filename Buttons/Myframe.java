package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener
{
    JButton butt;

    JLabel l2;
    Myframe()
    {
        ImageIcon icon = new ImageIcon("Buttons/img.jpg");

        butt = new JButton();
        butt.setBounds(200,100,200,200);
        butt.setBackground(Color.pink);

        butt.addActionListener(this);
        //butt.addActionListener(e -> sout("poo");
        // with this lambda expression same thing can be done without using interface and the below function

        butt.setText("I am A Button");
        butt.setFont(new Font("Cosmic Sans", Font.BOLD, 25));
        butt.setForeground(Color.CYAN);
        butt.setFocusable(false);   // to remove border from text on button

        butt.setIcon(icon);
        butt.setHorizontalTextPosition(JButton.CENTER);
        butt.setVerticalTextPosition(JButton.BOTTOM);

        //butt.setEnabled(false); // to disable the button

        l2 = new JLabel("You Clicked it Nigga");
        l2.setBounds(250,250,150,150);
        l2.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(butt);
        this.add(l2);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==butt)
        {
            //System.out.println("poo");
            //butt.setEnabled(false); // now button will be clickable only once
            l2.setVisible(true);
        }
    }
}
