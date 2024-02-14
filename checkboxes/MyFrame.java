package checkboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    JButton button;
    JCheckBox checkBox;

    ImageIcon icon1;
    ImageIcon icon2;
    MyFrame()
    {
        icon1 = new ImageIcon("checkboxes/cross.png");
        icon2 = new ImageIcon("checkboxes/tick.png");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        this.add(button);

        checkBox = new JCheckBox();
        checkBox.setText("I am not Gay");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.ITALIC,35));
        checkBox.setIcon(icon1);
        checkBox.setSelectedIcon(icon2);
        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button)
        {
            System.out.println(checkBox.isSelected());

        }

    }
}
