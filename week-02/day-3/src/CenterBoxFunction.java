import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a function that draws one square and takes 2 parameters:
// the square size and the graphics
// and draws a square of that size to the center of the canvas.
// draw 3 squares with that function.
// avoid code duplication.

public class CenterBoxFunction {

    public static void oneSquare(int sideLength, Graphics g){
        int distFromCentLine = sideLength / 2;
        g.drawRect(WIDTH / 2 - distFromCentLine, HEIGHT / 2 - distFromCentLine, sideLength, sideLength);
    }

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 3; i++){
            int sideLength = (int) (Math.random() * (WIDTH -2));
            oneSquare(sideLength, graphics);
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