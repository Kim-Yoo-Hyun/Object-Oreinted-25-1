package Week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEiGHT = 200;
    public ButtonDemo()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("Button Demo");
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        contentPane.setLayout(new FlowLayout());

        JButton stopButton = new JButton("Red");
        stopButton.addActionListenr(this);
        contentPane.add(stopButton);
        JButton goButton = new JButton("Green");
        contentPane.add(goButton);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Container contentPane = getCotentPane();
        if (e.getActionCommand().equals("Red"))
            contentPane.setBackground(Color.RED);
        else if (e.getActionCommand().equals("Green"))
            contentPane.setBackground(Color.GREEN);
        else
            System.out.println("Error in button interface.");
    }
}
