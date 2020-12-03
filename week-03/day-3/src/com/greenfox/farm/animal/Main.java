package com.greenfox.farm.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm(5);
        farm.breed("jancsi");
        farm.breed("petra");
        farm.breed("bela");
        farm.breed("jozsi");
        farm.breed("feri");
        farm.breed("fruzsi");
        farm.breed("ilona");
        farm.animals.get(1).hunger -= 10;
        farm.printProperties(farm);
        farm.slaughter();
        farm.printProperties(farm);


    }

}
