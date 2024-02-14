package Progress_Bars;

import javax.swing.*;

class Progress
{
    JFrame frame;
    JProgressBar progressBar;
    Progress()
    {
        progressBar = new JProgressBar();       // we can give (min, max) here. Also we can use it backwards
        progressBar.setValue(0);
        progressBar.setBounds(20,0,200,50);
        progressBar.setStringPainted(true);     // adds %age to it


        frame = new JFrame();

        frame.add(progressBar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill()
    {
        int i=0;
        while (i<=100)
        {
            progressBar.setValue(i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i+=20;
        }
        progressBar.setString("Done :)");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        new Progress();
    }
}
