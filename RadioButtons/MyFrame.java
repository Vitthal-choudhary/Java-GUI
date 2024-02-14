package RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton hotdog;
    MyFrame()
    {
        pizza = new JRadioButton("Pizza");
        pizza.addActionListener(this);
        hamburger = new JRadioButton("Ham Burger");
        hamburger.addActionListener(this);
        hotdog = new JRadioButton("Hot Dog");
        hotdog.addActionListener(this);

        // we can also add images instead of those dots, using the .seticon() method.

        //Since we can select them all now so we are creating Button Group

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizza);
        buttonGroup.add(hamburger);
        buttonGroup.add(hotdog);

        this.add(pizza);
        this.add(hamburger);
        this.add(hotdog);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==pizza)
        {
            System.out.println("Pizza");
        }
        else if (e.getSource()==hamburger)
        {
            System.out.println("Hamburger");
        }
        else if (e.getSource()==hotdog)
        {
            System.out.println("Hot Dog");
        }

    }
}
