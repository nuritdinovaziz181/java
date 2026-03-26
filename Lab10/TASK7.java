import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK7 extends JPanel {
    char ch;

    public TASK7() {
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Symbol: " + ch, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK7");
        TASK7 p = new TASK7();
        f.add(p);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        p.requestFocus();
    }
}