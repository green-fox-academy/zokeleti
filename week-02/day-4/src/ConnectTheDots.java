import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
// Create a function that takes 2 parameters:
// An array of {x, y} points and graphics
// and connects them with green lines.
// Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
// Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
// {120, 100}, {85, 130}, {50, 100}}
public class ConnectTheDots {
    public static int[][] separateAxis(int[][] points){
        int[] xCoords = new int[points.length];
        int[] yCoords = new int[points.length];
        int[][] result = new int[2][points.length];
        for (int i = 0; i < points.length; i++){
            xCoords[i] = points[i][0];
            yCoords[i] = points[i][1];

        }
        result[0] = xCoords;
        result[1] = yCoords;
        return result;
    }
    public static void mainDraw(Graphics graphics) {
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] fox = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                      {120, 100}, {85, 130}, {50, 100}};
        graphics.drawPolygon(separateAxis(box)[0], separateAxis(box)[1], box.length);
        graphics.drawPolygon(separateAxis(fox)[0], separateAxis(fox)[1], fox.length);

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