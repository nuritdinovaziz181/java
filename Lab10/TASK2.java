import javax.swing.*;
import java.awt.event.*;

public class TASK2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TASK2");
        JButton b = new JButton("Click");
        JLabel label = new JLabel();

        b.setBounds(100, 50, 100, 30);
        label.setBounds(100, 100, 150, 30);

        b.addActionListener(e -> label.setText("Hello Java"));

        f.add(b);
        f.add(label);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}