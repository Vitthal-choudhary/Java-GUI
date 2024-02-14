package JoptionPane;

import javax.swing.*;

public class main
{
    public static void main(String[] args)
    {
        /*
            JOption Pane - pops up a standard dialog box that
                            prompts user for a value or inform them of something
         */

        //JOptionPane.showMessageDialog(null, "This is useless info","Title-Nigga",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is useless info","Title-Nigga",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Why are you Gay","Title-Nigga",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is Warning","Title-Nigga",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Error----u are gay","Title-Nigga",JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null,"BRo why u gay","Title",JOptionPane.YES_NO_CANCEL_OPTION));
        // we can also store it in int choice. to get their answer.

        //String name = JOptionPane.showInputDialog("What is your name ? ");
        //System.out.println(name);

        String[] responses = {"No, u are awesome", "Thanx Nigga", "awwwwwww"};

        ImageIcon icon = new ImageIcon("JoptionPane/OIP.png");
        JOptionPane.showOptionDialog(null, "You are awesome", "Title",
                                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,
                                        responses,0);
    }
}
