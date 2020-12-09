package the_garden_application;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    private List<Plant> plants = new ArrayList<>();

    public void getGardenState(){
        for(Plant plant : plants){
            plant.getState();
        }
        System.out.println();
    }

    public Garden(List<Plant> plants){
        this.plants = plants;
        for (Plant plant : plants){
            plant.getState();
        }
        System.out.println();
    }
    public void waterGarden(double n){
        System.out.println("Watering with " + ((int) n));
        List<Plant> thirstyOnes = new ArrayList<>();
        for (Plant plant : plants){
            if (plant.needsWater()){
                thirstyOnes.add(plant);
            }
        }
        for (Plant plant : plants){
            if (thirstyOnes.contains(plant)){
                plant.water(n / thirstyOnes.size());
            }
        }
        getGardenState();
    }
}
