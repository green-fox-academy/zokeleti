package com.greenfox.pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> pirates = new ArrayList<>();
    Pirate captain;
    public void fillShip(){
        captain = new Pirate();
        pirates.add(captain);
        int crewSize = 2 + (int) (Math.random() * 8);
        for (int i = 0; i < crewSize; i++){
            pirates.add(new Pirate());
        }

    }

    public void printShipProperties(){
        System.out.println("The captain has drunk " + captain.rumsDrunk +
                " and (s)he is " + captain.state + "The ship has a crew of " + pirates.size());
    }

    public boolean battle(Ship otherShip) {
        int randomForDraw = 0;
        while(true){
            System.out.println(randomForDraw);
            if(pirates.size() - captain.rumsDrunk + randomForDraw == otherShip.pirates.size() - otherShip.captain.rumsDrunk) {
                randomForDraw = (int)(Math.random()*7)-3;
            } else if (pirates.size() - captain.rumsDrunk + randomForDraw > otherShip.pirates.size() - otherShip.captain.rumsDrunk) {
                int lossSize = (int) (Math.random() * otherShip.pirates.size());
                for (int i = lossSize; i > 0; i--) {
                    otherShip.pirates.remove(otherShip.pirates.size() - 1);
                }
                for (Pirate pirate : pirates) {
                    int numberOfRums = (int) (Math.random() * 5);
                    pirate.setRumsDrunk(numberOfRums);
                }
                return true;
            } else {
                int lossSize = (int) (Math.random() * pirates.size());
                for (int i = lossSize; i > 0; i--) {
                    pirates.remove(pirates.size() - 1);
                }
                for (Pirate pirate : otherShip.pirates) {
                    int numberOfRums = (int) (Math.random() * 5);
                    pirate.setRumsDrunk(numberOfRums);
                }
                return false;
            }
        }
    }

}
