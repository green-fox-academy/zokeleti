package com.greenfox.farm.animal;

/*Reuse your Animal class
Create a Farm class
it has list of Animals
                it has slots which defines the number of free places for animals
        breed() -> creates a new animal if there's place for it
        slaughter() -> removes the least hungry animal*/

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int slots;
    public Farm(int slots){
        this.slots = slots;
    }
    public  List<String> getNamesList(Farm farm){
        List<String> namesList = new ArrayList<>();
        for (Animal animal : farm.animals){
            namesList.add(animal.name);
        }
        return namesList;
    }
    public void printProperties(Farm farm){
        for (Animal animal : farm.animals){
            System.out.println(animal.name + "'s thirst level is " + animal.thirst + " and the hunger level is " + animal.hunger);
        }
    }

    public void breed(String name){
        if (slots > animals.size()){
            animals.add(new Animal(name));
        }else{
            System.out.println("The farm is already full");
        }
    }
    public void slaughter(){
        int currentMin = 100;
        int indexToSlaughter = 0;
        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i).hunger < currentMin){
                currentMin = animals.get(i).hunger;
                indexToSlaughter = i;
            }
        }
        animals.remove(indexToSlaughter);
    }


}
