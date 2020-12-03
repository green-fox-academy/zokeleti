package com.greenfox.sharpie_set;

/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
                countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies*/

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100F;
    public Sharpie(String color, Float width){
        this.color = color;
        this.width = width;
    }
    public void use(){
        this.inkAmount--;
    }
    public void use(float amount){this.inkAmount-=amount;}
}
