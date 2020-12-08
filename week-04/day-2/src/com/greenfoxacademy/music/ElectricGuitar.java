package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(){
        name = "Electric Guitar";
        numberOfStrings = 6;
    }
    public ElectricGuitar(int numberOfStrings) {
        name = "Electric Guitar";
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public String sound() {
        return "Twang";
    }




}
