package com.greenfox.petrol_station;

/*Create Station and Car classes
        Station
        gasAmount
        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        Car
        gasAmount
        capacity
        create constructor for Car where:
        initialize gasAmount -> 0
        initialize capacity -> 100*/

public class Car {
    int gasAmount;
    int capacity;
    public Car(){
        this.gasAmount = 0;
        this.capacity = 100;
    }
}
