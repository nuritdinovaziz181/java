import javax.swing.*;
import java.awt.*;

public class task19 extends JPanel {


    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w=getWidth();
        int h=getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        for(double x=-10;x<=10;x+=0.01){

            double y = x/(x*x - x + 3);

            int px=(int)(w/2 + x*40);
            int py=(int)(h/2 - y*40);

            g.fillOval(px,py,2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("task19");
        f.setSize(600,600);
        f.add(new task19());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
