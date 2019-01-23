import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int sqSize = 320 ;

        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.MAGENTA};
        for (int i = 0; i < colors.length ; i++)  {
            drawSingleCenteredSquare(sqSize -= 50, colors[i], graphics);

        }
    }


    public static void drawSingleCenteredSquare ( int sqSize, Color clr, Graphics graphics) {

        graphics.setColor(clr);
        graphics.fillRect((WIDTH / 2) - (sqSize / 2), (HEIGHT / 2) - (sqSize / 2), sqSize,sqSize);
    }

    // Don't touch the code below
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