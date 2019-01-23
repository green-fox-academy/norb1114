 import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
        public static void mainDraw(Graphics graphics) {

            int x = 0;
            int y = 0;
            drawfunc(x,y, graphics);

        }

        public static void drawfunc (int x, int y, Graphics graphics) {

            for (int i = y; i < 3 ; i++) {

                graphics.setColor(Color.blue);
                graphics.drawLine(x, y + (i * 50), 160, 160);

            }
        }
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main(String[] args) {
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



