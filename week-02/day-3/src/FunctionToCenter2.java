import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// Create a function that draws a single line and takes 3 parameters:
// The x and y coordinates of the line's starting point and the graphics
// and draws a line from that point to the center of the canvas.
// Fill the canvas with lines from the edges, every 20 px, to the center.

public class FunctionToCenter2 {
// create a function that folds out the sides and makes a map
// where each Integer key has a List which contains the coordinate
// values for the edge points
    public static Map<Integer,List<Integer>> makeMap(){
        Integer x = 0;
        Integer y = 0;
        Map<Integer, List<Integer>> result = new HashMap<>();
        for (Integer i = 0; i < (WIDTH + HEIGHT) * 4; i++){
            if (x < WIDTH && y == 0){
                x += 1;
            }
            else if (y < HEIGHT && x == WIDTH){
                y += 1;
            }
            else if (x != 0 && y == HEIGHT){
                x -= 1;
            }
            else if (x == 0 && y != 0){
                y -= 1;
            }
            List<Integer> coordinates = Arrays.asList(x,y);

            result.put(i, coordinates);
        }
        return result;
    }
// create a function which finds the start key on the map created above
// based on the coordinates set as start coordinates
    public static Integer findStart(Map map, List startCoord){
        Integer result = 0;
        for (Integer i = 0; i < (Integer) map.size(); i++){
            if (startCoord.equals(map.get(i))){
                result = i;
                System.out.println("findStart" + i);
                break;
            }
        }
        return result;
    }
// create a function that creates a list which will contain the keys of the map we will use
// as starting points on the edges
    public static List<Integer> getSteps(Integer start) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < (HEIGHT + WIDTH) * 4 + 1 ; i += 20) {
            result.add(i);
        }
        System.out.println("Steps: " + result);
        return result;
    }
// a function that draws a line from a given coordinate to the center of the display
    public static void toCenter(List<Integer> coord,  Graphics g){
        g.drawLine(coord.get(0), coord.get(1), WIDTH/2, HEIGHT/2);
    }
// main function which calls the above functions in the correct order
    public static void mainDraw(Graphics graphics) {
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        myMap = makeMap();
        System.out.println("Mymap size " + myMap.size());
        Integer startX = 320;
        Integer startY = 317;
        List<Integer> startCoord = new ArrayList<>(Arrays.asList(startX, startY));
        Integer startStep = findStart(myMap, startCoord);
        List<Integer> steps = getSteps(startStep);
        for (Integer i = 0; i < ((HEIGHT + WIDTH)*2)/20 +1; i++) {
            System.out.println("Mymap iteration " + i + myMap.get(steps.get(i)));
            toCenter(myMap.get(steps.get(i)), graphics);
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
            repaint();
        }
    }
}