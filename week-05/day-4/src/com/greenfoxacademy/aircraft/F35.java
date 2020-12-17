package com.greenfoxacademy.aircraft;

public class F35 extends Aircraft{
    public F35(){
        super();
        this.maxAmmo =12;
        this.baseDamage = 50;
        this.type = this.getClass().getSimpleName();
    }
}






