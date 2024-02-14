package File_Opening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class MyFrame extends JFrame implements ActionListener
{
    JButton button;
    MyFrame()
    {
        button = new JButton("Select a file");
        button.addActionListener(this);

        this.add(button);

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
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\iamvi\\Downloads"));

            //int response = fileChooser.showOpenDialog(null);       // select file to open
            int response = fileChooser.showSaveDialog(null);

            if (response==JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

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
