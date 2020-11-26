import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int axis = 520;
        for (int i = 0; i < 14; i ++){
            graphics.setColor(Color.green);
            graphics.drawLine(0, axis,axis,560);
            graphics.setColor(Color.magenta);
            graphics.drawLine(560, axis, axis, 0);
            axis -= 40;
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