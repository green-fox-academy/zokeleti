package com.greenfoxacademy.aircraft;

public class Main {
    public static void main(String[] args) throws Exception {
        Carrier carrier1 = new Carrier(2500, 2400);
        Carrier carrier2 = new Carrier(3200, 2450);
        carrier1.armCarrier();
        carrier2.armCarrier();
        carrier1.fill();
        System.out.println("This is carrier2 before filling: " + carrier2.getStatus());
        carrier2.fill();
        System.out.println("This is the 3rd plane on carrier2: " + carrier2.aircrafts.get(3).ammo);
        System.out.println("filled carrier2\n" + carrier2.getStatus());
        carrier1.fight(carrier2);
        System.out.println(carrier1.getStatus());
        System.out.println(carrier2.getStatus());
    }
}
