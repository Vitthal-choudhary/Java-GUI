package Drag_and_Drop;

import javax.swing.*;

class MyFrame extends JFrame
{
    ImageIcon icon;
    MyFrame()
    {
        icon = new ImageIcon("Drag_and_Drop/R.png");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
