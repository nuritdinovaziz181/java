import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK4 extends JPanel {
    Color c = Color.RED;

    public TASK4() {
        JButton b = new JButton("Change");
        add(b);

        b.addActionListener(e -> {
            if(c == Color.RED) c = Color.GREEN;
            else if(c == Color.GREEN) c = Color.BLUE;
            else c = Color.RED;
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(100, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK4");
        f.add(new TASK4());
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}