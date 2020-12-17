package com.greenfoxacademy.aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    protected List<Aircraft> aircrafts = new ArrayList<>();
    protected int storeOfAmmo;
    protected int hp;
    public int getHp(){
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public Carrier(int ammo, int hp){
        this.storeOfAmmo = ammo;
        this.hp = hp;
    }
    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }
    public void fill() throws Exception {
        if(storeOfAmmo>0) {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority()) {
                    storeOfAmmo = aircraft.refill(storeOfAmmo);
                }
            }
            for (Aircraft aircraft : aircrafts) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
        } else {
            throw new Exception("There's not enough ammo mate!");
        }
    }
    public void fight(Carrier otherCarrier){
        int alldamage = 0;
        for (Aircraft aircraft : aircrafts){
            alldamage += aircraft.fight();
        }
        if (alldamage < otherCarrier.hp) {
            otherCarrier.hp -= alldamage;
        } else {
            otherCarrier.hp = 0;
        }
    }
    public String getStatus(){
        int alldamage = 0;
        for (Aircraft aircraft : aircrafts){
            alldamage += aircraft.ammo * aircraft.baseDamage;
        }
        if(hp > 0){
            String status = "HP: " + hp + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + storeOfAmmo + ", Total Damage: " + alldamage + "\n";
            for (Aircraft aircraft : aircrafts){
                status = status + aircraft.getStatus();
            }
            return status;
        }
        return "It's dead Jim";

    }
    public void armCarrier(){
        for (int i = 0; i < Math.random() * 15 + 3; i++){
            if (i % 2 == 0){
                add(new F16());
                continue;
            }
            add(new F35());
        }
    }
}




