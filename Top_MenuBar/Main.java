package Top_MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class Screen extends JFrame implements ActionListener
{
    JMenuBar menuBar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;

    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;


    Screen()
    {
        menuBar = new JMenuBar();

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        helpmenu = new JMenu("Help");

        load = new JMenuItem("Load");
        load.addActionListener(this);
        save = new JMenuItem("Save");
        save.addActionListener(this);
        exit = new JMenuItem("Exit");
        exit.addActionListener(this);

        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);

        filemenu.add(load);
        filemenu.add(save);
        filemenu.add(exit);

        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(helpmenu);

        this.setJMenuBar(menuBar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==load)
        {
            System.out.println("Poop u loaded");
        }
        else if (e.getSource()==save)
        {
            System.out.println("Poop U Saved");
        }
        else if (e.getSource()==exit)
        {
            System.exit(0);
        }

    }
}

public class Main
{
    public static void main(String[] args)
    {
        new Screen();
    }
}
