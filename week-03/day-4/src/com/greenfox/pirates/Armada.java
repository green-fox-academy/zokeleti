package com.greenfox.pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships = new ArrayList<>();
    public void fillArmada() {
        int armadaSize = 2 + (int) (Math.random() * 8);
        for (int i = 0; i < armadaSize; i++) {
            ships.add(new Ship());
            ships.get(i).fillShip();
        }
    }

    public boolean war(Armada otherArmada) {
        int thisArmadaSize = ships.size();
        int thisArmadaCurrent = 0;
        int otherArmadaSize = otherArmada.ships.size();
        int otherArmadaCurrent = 0;
        while (thisArmadaCurrent < thisArmadaSize && otherArmadaCurrent < otherArmadaSize) {
            if (ships.get(thisArmadaCurrent).battle(otherArmada.ships.get(otherArmadaCurrent))) {
                otherArmadaCurrent++;
            } else {
                thisArmadaCurrent++;
            }
        }
        if (otherArmadaCurrent == otherArmadaSize){
            return true;
        }
        return false;
    }
}

