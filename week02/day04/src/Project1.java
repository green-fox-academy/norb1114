import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Project1 {
    public static void mainDraw(Graphics graphics) {

        int x = 20;
        int y = 20;

        for (int i = 1; i < 16; i++) {

            graphics.setColor(Color.magenta);
            graphics.drawLine(x * i, 0, 320, y * i);

        }
        for (int i = 1; i < 16; i++) {

            graphics.setColor(Color.green);
            graphics.drawLine(x * i, 320, 0, y * i);

        }




    }
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
