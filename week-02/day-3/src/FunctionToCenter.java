import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// Create a function that draws a single line and takes 3 parameters:
// The x and y coordinates of the line's starting point and the graphics
// and draws a line from that point to the center of the canvas.
// Fill the canvas with lines from the edges, every 20 px, to the center.

public class FunctionToCenter {

    public  static void toCenter(int x, int y, Graphics g){
        for (int i = 0; i < ((WIDTH + HEIGHT) * 2 / 20) + 1; i++){
            if(WIDTH-x > 20 && y == 0){
                x += 20;
            }
            else if (WIDTH - x <= 20 && y == 0){
                y = 20 - (WIDTH - x);
                x = WIDTH;
            }
            else if (x == WIDTH && HEIGHT - y > 20){
                y += 20;
            }
            else if (x == WIDTH && HEIGHT - y <= 20){
                x = WIDTH - (HEIGHT - y);
                y = HEIGHT;
            }
            else if (y == HEIGHT && x > 20){
                x -= 20;
            }
            else if (x <= 20 && y == HEIGHT){
                y = HEIGHT -  (20 - x);
                x = 0;
            }
            else if (y > 20 && x == 0){
                y -= 20;
            }
            g.drawLine(x, y, WIDTH/2, HEIGHT/2);

        }
    }
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        toCenter(1,0, graphics);
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