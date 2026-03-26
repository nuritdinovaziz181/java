import javax.swing.*;
import java.awt.event.*;

public class TASK3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TASK3");

        JTextField t = new JTextField();
        JButton b = new JButton("OK");
        JLabel l = new JLabel();

        t.setBounds(50, 30, 150, 30);
        b.setBounds(50, 70, 80, 30);
        l.setBounds(50, 110, 200, 30);

        b.addActionListener(e -> {
            l.setText("Сәлем, " + t.getText());
        });

        f.add(t); f.add(b); f.add(l);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}