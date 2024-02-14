package Drop_Down_Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    JComboBox comboBox;
    MyFrame()
    {
        String[] animals = {"Dog", "Cat", "Owl"};
        // to pass any other datatype use wrapper class of it

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // this allows us to type in something and use use it
        //comboBox.setEditable(true);

        // comboBox.getItemCount();  // gives no. of items in option menu

        //comboBox.addItem("Horse");    // adds an item

//        comboBox.insertItemAt("Pig",0);     // to add at specific index
//        comboBox.setSelectedIndex(0);           // this method puts the (0) th index in top when first displaying
//
//        comboBox.removeItem("Cat");     // to remove
//        comboBox.removeItemAt(1);       // to remove
//
//        comboBox.removeAllItems();      // clear all

        this.add(comboBox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==comboBox)
        {
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());

        }
    }
}
