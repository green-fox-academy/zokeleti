package com.groot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpeedCalculator {
    Double distance;
    Double time;
    Double speed;

    public SpeedCalculator(Double distance, Double time){
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }
}
