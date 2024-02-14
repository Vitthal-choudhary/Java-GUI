package MouseListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements MouseListener
{
    JLabel label;
    MyFrame()
    {
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        label.addMouseListener(this);

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        // Invoked when mouse button has been clicked (press+release) on a component
        //System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        // invoked when mouse button is pressed on a component
        System.out.println("You Pressed");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        // invoked when mouse button has been released on a component
        System.out.println("You Released");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        // invoked when mouse enters a component
        System.out.println("You entered the component");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        // invoked when mouse exits a component
        System.out.println("You exited from component");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
