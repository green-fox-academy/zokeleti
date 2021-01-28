package com.groot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
public class Ship {

    Integer caliber25;
    Integer caliber30;
    Integer caliber50;
    @JsonProperty(value = "shipstatus")
    String shipStatus;
    Boolean ready;

    public Ship(Integer caliber25, Integer caliber30, Integer caliber50) {
        this.caliber25 = caliber25;
        this.caliber30 = caliber30;
        this.caliber50 = caliber50;
        this.shipStatus = "empty";
        this.ready = false;
    }
    public Ship(){
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipStatus = "empty";
        this.ready = false;
    }
}

