package com.greenfoxacademy.aircraft;

public abstract class Aircraft {
    protected int ammo;
    protected int maxAmmo;
    protected int baseDamage;
    protected  String type;
    public int fight(){
        int damageDealt = ammo * baseDamage;
        ammo = 0;
        return damageDealt;
    }
    public int refill(int availableAmmo){
        //System.out.println("this is the ammo before filling: " + this.ammo);
        int ammoNeeded = maxAmmo-this.ammo;
        if(ammoNeeded > availableAmmo){
            this.ammo += availableAmmo;
            //System.out.println("This is the ammo after fill: " + this.ammo);
            return 0;
        } else {
            this.ammo = maxAmmo;
            //System.out.println("This is the ammo after fill: " + this.ammo);
            return availableAmmo-ammoNeeded;
        }


    }
    public String getType(){
        return type;
    }
    public String getStatus(){
        return "Type " + this.type + ", Ammo: " + this.ammo +
                ", Base Damage: " + this.baseDamage +
                ", All Damage: " + (this.ammo*this.baseDamage) + "\n";
    }
    public boolean isPriority(){
        if(type.equals("F35")){
            return true;
        }
        return false;
    }
}
