package Week12;

import java.awt.*;
import javax.swing.*;

public class JComponentExample {
    public static void main(String[] arguments) {
        MyJComponent com = new MyJComponent();

        JFrame.setDefaultLookAndFeeLDecorated(true);
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(com);
        frame.setVisible(true);

    }
}

class MyJComponent extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(50, 10, 150, 150);
    }
}
