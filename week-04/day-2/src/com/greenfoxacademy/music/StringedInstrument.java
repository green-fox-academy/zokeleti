package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument{
    int numberOfStrings;
    public abstract String sound();
    @Override
    public void play(){
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
