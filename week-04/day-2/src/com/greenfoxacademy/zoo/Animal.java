package com.greenfoxacademy.zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String favouriteFood;
    public String getName(){
        return name;
    }
    public abstract void breed();
    public void eat(){
        System.out.println("I'm eating " + favouriteFood + " like an animal.");
    }
}
