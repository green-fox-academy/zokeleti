import javax.swing.*;

import java.awt.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// draw four different size and color rectangles.
// avoid code duplication.


public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 4; i++){
            int r = (int) (Math.random()*256);
            int g = (int) (Math.random()*256);
            int b = (int) (Math.random()*256);
            int x = (int) (Math.random()*WIDTH);
            int y = (int) (Math.random()*HEIGHT);
            int width = (int) (Math.random() * (WIDTH - (x + 1)));
            int height = (int) (Math.random() * (HEIGHT - (y + 1)));

            graphics.setColor(new Color(r, g, b));
            graphics.drawRect(x, y, width, height);
        }



    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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