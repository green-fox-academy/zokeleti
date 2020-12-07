package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> aircrafts = new ArrayList<>();
    private int ammoStore;
    private  int hp;
    public Carrier(int ammoStore, int hp){
        this.ammoStore = ammoStore;
        this.hp = hp;
    }
    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }
    public void sortByPriority(){
        List<Aircraft> temp = new ArrayList<>();
        for (Aircraft aircraft : aircrafts){
            if (aircraft.isPriority()){
                temp.add(aircraft);
            }
        }
        for (Aircraft aircraft : aircrafts){
            if (!aircraft.isPriority()){
                temp.add(aircraft);
            }
        }
        aircrafts = temp;
    }

    public void fill() throws Exception {
        if (ammoStore == 0){
            throw new Exception();
        }
        sortByPriority();
        for (Aircraft aircraft : aircrafts){
            ammoStore = aircraft.refill(ammoStore);
        }
    }
    public void fight(Carrier otherCarrier){
        for (Aircraft aircraft : aircrafts){
            otherCarrier.hp -= aircraft.fight();
        }
        if (otherCarrier.hp < 0){
            otherCarrier.hp = 0;
        }
    }
    public String getStatus(){
        if (hp == 0){
            System.out.println("It's dead Jim");
            return "It's dead Jim.";
        }
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts){
            totalDamage += aircraft.getMaxAmmo();
        }
        System.out.println("HP: " + hp + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStore + ", Total Damage: " + totalDamage);
        System.out.println("Aircrafts:");
        for (Aircraft aircraft : aircrafts){
            System.out.println(aircraft.getStatus());
        }
        return "";
    }
    public void armCarrier(){
        for (int i = 0; i < Math.random() * 15 + 3; i++){
            if (i % 2 == 0){
                add(new Aircraft("F16"));
                continue;
            }
            add(new Aircraft("F35"));
        }
    }
}
