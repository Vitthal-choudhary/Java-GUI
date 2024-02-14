package Key_Listner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame extends JFrame implements KeyListener
{
    JLabel label;

    MyFrame()
    {
        ImageIcon icon = new ImageIcon("Key_Listner/R.png");

        label = new JLabel();
        label.setBounds(200,250,200,200);
        label.setIcon(icon);

        this.add(label);

        this.addKeyListener(this);

        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e)
    {
        // it is invoked when a key is typed. Uses KeyChar, char output

        switch (e.getKeyChar())
        {
            case 'a':
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        // it is invoked when a physical key is pressed down. Uses KeyCode, int output

        switch (e.getKeyCode())
        {
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 39:
                label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // called whenever a button is released.
        //System.out.println("You released key char: "+e.getKeyChar());
        //System.out.println("You released key char: "+e.getKeyCode());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
