package Sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Slider_Demo extends JFrame implements ChangeListener
{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    Slider_Demo()
    {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,400));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.ITALIC,20));

        slider.setOrientation(SwingConstants.VERTICAL);     // default is Horizontal

        slider.addChangeListener(this);

        panel.add(slider);

        label.setText("°C = "+ slider.getValue());
        label.setFont(new Font(null, Font.BOLD,20));

        panel.add(label);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        label.setText("°C = "+ slider.getValue());
    }
}

public class main
{
    public static void main(String[] args)
    {
        new Slider_Demo();
    }
}
