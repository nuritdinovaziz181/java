import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK10 extends JPanel {
    Color c = Color.RED;

    public TASK10() {
        JCheckBox r = new JCheckBox("Red");
        JCheckBox g = new JCheckBox("Green");
        JCheckBox b = new JCheckBox("Blue");

        add(r); add(g); add(b);

        ItemListener listener = e -> {
            if(r.isSelected()) c = Color.RED;
            if(g.isSelected()) c = Color.GREEN;
            if(b.isSelected()) c = Color.BLUE;
            repaint();
        };

        r.addItemListener(listener);
        g.addItemListener(listener);
        b.addItemListener(listener);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillRect(100, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TASK10");
        f.add(new TASK10());
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}