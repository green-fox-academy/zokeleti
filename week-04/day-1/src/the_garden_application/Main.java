package the_garden_application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> testGarden = new ArrayList<>();
        testGarden.add(new Flower("yellow"));
        testGarden.add(new Flower("blue"));
        testGarden.add(new Tree("purple"));
        testGarden.add(new Tree("orange"));

        Garden myGarden = new Garden(testGarden);

        myGarden.waterGarden(40);
        myGarden.waterGarden(70);

    }

}
