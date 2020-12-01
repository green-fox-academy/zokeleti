/*

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static List<int[]> getCoordinates(int upperX, int upperY){
        int[] allX = {upperX, upperX - 15, upperX + 15};
        int[] allY = {upperY, upperY + (int)(Math.sqrt(3) * 15), upperY + (int)(Math.sqrt(3) * 15)};
        List<int[]> result = new ArrayList<>(Arrays.asList(allX, allY));
        return result;

    }
    public static List<int[]> getNextTops(List<int[]> lastTops){
        List<int[]> result = new ArrayList<>();
        int[] nextXs = new int[lastTops.get(0).length+1];
        int[] nextYs = new int[lastTops.get(1).length+1];
        for (int i = 0; i < lastTops.get(0).length+1){
            nextXs [i] = getCoordinates(lastTops.get(0)[i], lastTops.get(1)[i])
        }
    }

    public static List<int[]> createNextLayerTops(List<int[]> feed) {

    }

    public static void drawTriangle(int upperX, int upperY, Graphics g){
        List<int[]> allPoints = getCoordinates(upperX, upperY);
        int n = 3;
        g.drawPolygon(allPoints.get(0), allPoints.get(1), n);
    }
    public static List<>
    public static void mainDraw(Graphics graphics){
        int startCoordX = 300;
        int startCoordY = 10;
        int numberOfLayers = 21;
        List<List<Integer>> listOfNextTops = new ArrayList<>(Arrays.asList())
        for (int i = 0; i < numberOfLayers; i++){
            for (int j = 0; j < )
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
*/
