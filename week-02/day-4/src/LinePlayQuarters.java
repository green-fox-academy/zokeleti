import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int fraction = 16;
        int oneSide = WIDTH/fraction;
        int axis;
        for (int i = 0; i < fraction; i++) {
            for (int j = 0; j < fraction; j++){
                axis = oneSide * 13/14;
                for (int line = 0; line < 14; line++) {
                    graphics.setColor(Color.green);
                    graphics.drawLine(j*oneSide, axis+ i*oneSide, axis + j*oneSide, oneSide + i*oneSide);
                    graphics.setColor(Color.magenta);
                    graphics.drawLine(oneSide + j*oneSide, axis + i * oneSide, axis+j*oneSide, i*oneSide);
                    axis -= oneSide /14;
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 560;
    static int HEIGHT = 560;

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