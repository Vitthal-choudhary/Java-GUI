package Text_Fields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Frame extends JFrame implements ActionListener
{
    JButton but;
    JTextField textField;
    Main_Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        but = new JButton("Submit");
        but.addActionListener(this);
        this.add(but);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(240,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,15));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.WHITE);
        this.add(textField);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==but)
        {
            System.out.println(textField.getText());
            textField.setEditable(false);       // can't be changed after this
            but.setEnabled(false);
        }

    }
}
