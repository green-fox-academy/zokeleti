package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{
    public Violin(){
        name = "Violin";
        numberOfStrings = 6;
    }
    public Violin(int numberOfStrings) {
        name = "Violin";
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public String sound() {
        return "Screech";
    }

}
