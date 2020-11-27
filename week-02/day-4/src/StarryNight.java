import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
// Draw the night sky:
//  - The background should be black
//  - The stars can be small squares
//  - The stars should have random positions on the canvas
//  - The stars should have random color (some shade of grey)

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        for (int i = 0; i < 500; i++){
            int randRGB = (int) (Math.random() * 256);
            int randX = (int) (Math.random() * WIDTH);
            int randY = (int) (Math.random() * HEIGHT);
            graphics.setColor(new Color(randRGB, randRGB, randRGB));
            graphics.fillRect(randX, randY, 5, 5);
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