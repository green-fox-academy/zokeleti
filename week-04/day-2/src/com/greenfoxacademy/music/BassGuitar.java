package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{
    public BassGuitar(){
        name = "Bass Guitar";
        numberOfStrings = 4;
    }
    public BassGuitar(int numberOfStrings) {
        name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

}
