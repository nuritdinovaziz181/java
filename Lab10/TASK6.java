import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK6 extends JPanel {
    int x, y;

    public TASK6() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 5, 5);
        g.drawString("X=" + x + " Y=" + y, 20, 20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK6");
        f.add(new TASK6());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}