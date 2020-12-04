package com.greenfox.pirates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada();
        Armada armada2 = new Armada();
        armada1.fillArmada();
        armada2.fillArmada();
        System.out.println("Armada 1");
        for (Ship ship : armada1.ships){
            ship.printShipProperties();
        }
        System.out.println("Armada 2");
        for (Ship ship : armada2.ships){
            ship.printShipProperties();
        }
        System.out.println(armada1.war(armada2));
        //List<Boolean> testresults = new ArrayList<>();
        //for (int i = 0; i<3001; i++){
        //    testresults.add(armada1.war(armada2));
        //}
        //int numOfTrues = Collections.frequency(testresults, true);
        //System.out.println("Trues: " + numOfTrues);
        //System.out.println("Falses: " + (3001 - numOfTrues));
        for (Ship ship : armada1.ships){
            ship.printShipProperties();
        }
        for (Ship ship : armada2.ships){
            ship.printShipProperties();
        }
    }
}
