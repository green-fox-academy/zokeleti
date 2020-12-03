package com.greenfox.sharpie_set;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("White", 2.33F);
        Sharpie sharpie2 = new Sharpie("Pink", 2.44F);
        Sharpie sharpie3 = new Sharpie("Brown", 1.99F);
        sharpie1.use(100);

        SharpieSet sharpies = new SharpieSet();
        sharpies.sharpies.addAll(Arrays.asList(sharpie1, sharpie2, sharpie3));
        System.out.println(sharpies.sharpies.size());
        System.out.println(sharpies.countUsable());
        sharpies.removeTrash();
        System.out.println(sharpies.sharpies.size());
    }
}
