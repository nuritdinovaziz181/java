import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK5 extends JPanel {
    int x = 50, y = 50;

    public TASK5() {
        JTextField tx = new JTextField(5);
        JTextField ty = new JTextField(5);
        JButton b = new JButton("Draw");

        add(tx); add(ty); add(b);

        b.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK5");
        f.add(new TASK5());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}