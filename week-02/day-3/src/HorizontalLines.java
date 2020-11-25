import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
// Create a function that draws a single line and takes 3 parameters:
// The x and y coordinates of the line's starting point and the graphics
// and draws a 50 long horizontal line from that point.
// Draw at least 3 lines with that function using a loop.

public class HorizontalLines {

    public static void horizontal50(int x, int y, Graphics g){
        g.drawLine(x, y, x+50, y);
    }
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++){
            int x = (int) (Math.random() * 550);
            int y = (int) (Math.random() * 600);
            horizontal50(x, y, graphics);
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