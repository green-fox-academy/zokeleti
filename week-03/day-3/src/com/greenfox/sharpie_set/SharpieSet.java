package com.greenfox.sharpie_set;

/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
                countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();


    public int countUsable(){
        int result = 0;
        for (Sharpie sharpie : sharpies){
            if(sharpie.inkAmount > 0F){
                result++;
            }
        }
        return result;

    }
    public void removeTrash(){
        List<Integer> toRemove = new ArrayList<>();
        for (int i = 0; i < sharpies.size(); i++){
            if (sharpies.get(i).inkAmount <= 0 ){
                toRemove.add(i);
            }
        }
        Collections.reverse(toRemove);
        for(int indexToRemove : toRemove){
            sharpies.remove(indexToRemove);
        }
    }

}
