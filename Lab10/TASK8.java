import javax.swing.*;
import java.awt.event.*;

public class TASK8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TASK8");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("+");
        JLabel l = new JLabel();

        t1.setBounds(30, 30, 50, 30);
        t2.setBounds(100, 30, 50, 30);
        b.setBounds(70, 70, 50, 30);
        l.setBounds(70, 110, 100, 30);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int c = Integer.parseInt(t2.getText());
            l.setText("Sum: " + (a + c));
        });

        f.add(t1); f.add(t2); f.add(b); f.add(l);

        f.setSize(250, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}