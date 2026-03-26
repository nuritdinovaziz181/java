import javax.swing.*;
import java.awt.*;

public class TASK1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 50, 45);

        g.drawOval(200, 50, 100, 100);
        g.drawString("Circle", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 50, 145);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TASK1");
        frame.add(new TASK1());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}