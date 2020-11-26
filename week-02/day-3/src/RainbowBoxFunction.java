import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// Create a square drawing function that takes 3 parameters:
// The square size, the fill color, graphics
// and draws a square of that size and color to the center of the canvas.
// Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

public class RainbowBoxFunction {

    public static void oneSquare(int size, Color color, Graphics g){
        g.setColor(color);
        int distFromCentLine = size / 2;
        g.fillRect(WIDTH / 2 - distFromCentLine, HEIGHT / 2 - distFromCentLine, size, size );
    }
    public static void mainDraw(Graphics graphics) {
        List<Color> colorList = new ArrayList<>();
        Color violet = new Color(0x8f, 0x00, 0xFF);
        Color indigo = new Color(0x4b, 0x00, 0x82);
        colorList.addAll(Arrays.asList(Color.red, Color.orange, Color.yellow, Color.green, Color.blue, violet, indigo));
        int maxSize = WIDTH;
        int minSize = WIDTH - (WIDTH - 56);
        for (Color color : colorList){
            int size = (int) (Math.random() * (maxSize - minSize)) + minSize;
            maxSize = size - 8;
            if (size <= minSize + 8){
                minSize -= 6;
            }
            oneSquare(size, color, graphics);

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