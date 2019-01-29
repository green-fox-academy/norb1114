import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int x = WIDTH /16;
        int y = HEIGHT /16 ;


        for (int i = 16; i < 0; i--) {

            graphics.setColor(Color.green);
            graphics.drawLine(0, y *i, x * i, 320;

        }
       /* for (int i = 1; i < 16; i++) {

            graphics.setColor(Color.green);
            graphics.drawLine(x * i, 320, 0, y * i);

        }*/

    }


    //public static int startingPointChanger (int x, int y) {




    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
