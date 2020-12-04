package com.greenfox.pirates;

import java.util.List;

public class Pirate {
    String state = "";
    int rumsDrunk = 0;

    public void drinkSomeRum() {
        rumsDrunk++;
    }

    public void setRumsDrunk(int numberOfRums){
        rumsDrunk += numberOfRums;
    }

    public void howsItGoingMate() {
        if (state.equals("he's dead")){
            System.out.println(state);
        } else if (rumsDrunk <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        if(state.equals("he's dead"))
        state = "he's dead";
    }

    public void brawl(Pirate pirate) {
        int outcome = (int) (Math.random() * 3);
        switch (outcome) {
            case 1:
                pirate.die();
                break;
            case 2:
                die();
                break;
            case 3:
                state = "passed out";
                pirate.state = "passed out";
                break;

        }
    }
}

