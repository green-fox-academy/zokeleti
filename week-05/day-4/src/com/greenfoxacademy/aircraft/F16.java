package com.greenfoxacademy.aircraft;

public class F16 extends Aircraft{
    public F16(){
        super();
        this.maxAmmo = 8;
        this.baseDamage = 30;
        this.type = this.getClass().getSimpleName();
    }
}




