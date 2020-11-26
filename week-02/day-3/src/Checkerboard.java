import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// Fill the canvas with a checkerboard pattern.

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.white);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 8; i++){
            int counter = 0;
            x = 0;
            for (int j = 0; j < 8; j++){
                graphics.fillRect(x, y, 40, 40);
                x += 40;
                if (counter < 7) {
                    if (graphics.getColor() == Color.white) {
                        graphics.setColor(Color.black);
                    } else {
                        graphics.setColor(Color.white);
                    }
                }
                counter+=1;
            }
            y += 40;
        }


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