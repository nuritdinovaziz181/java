import javax.swing.*;
import java.awt.*;

public class TASK9 extends JPanel {
    int x = 0;

    public TASK9() {
        new Timer(100, e -> {
            x += 5;
            if(x > getWidth()) x = 0;
            repaint();
        }).start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK9");
        f.add(new TASK9());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}