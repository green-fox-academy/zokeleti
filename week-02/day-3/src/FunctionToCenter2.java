import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter2 {

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

    public static Integer findStart(Map map, List startCoord){
        Integer result = 0;
        for (Integer i = 0; i < (Integer) map.size(); i++){
            if (startCoord.equals(map.get(i))){
                result = i;
                break;
            }
        }
        return result;
    }

    public static List<Integer> getSteps(Integer start) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < (HEIGHT + WIDTH) * 4 + 1 ; i += 20) {
            result.add(i);
        }
        return result;
    }

    public static void toCenter(List<Integer> coord,  Graphics g){
        g.drawLine(coord.get(0), coord.get(1), WIDTH/2, HEIGHT/2);
    }
    public static void mainDraw(Graphics graphics) {
        Map<Integer, List<Integer>> myMap;
        myMap = makeMap();
        Integer startX = (int) (System.currentTimeMillis()%200)/10 ;
        Integer startY = 0;
        List<Integer> startCoord = new ArrayList<>(Arrays.asList(startX, startY));
        Integer startStep = findStart(myMap, startCoord);
        List<Integer> steps = getSteps(startStep);
        for (Integer i = 0; i < ((HEIGHT + WIDTH)*2)/20 +1; i++) {
            toCenter(myMap.get(steps.get(i)), graphics);
        }
    }


    static int WIDTH = 720;
    static int HEIGHT = 720;

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