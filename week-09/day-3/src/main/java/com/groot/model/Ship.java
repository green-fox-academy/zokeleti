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

    private Integer caliber25;
    private Integer caliber30;
    private Integer caliber50;
    @JsonProperty(value = "shipstatus")
    private String shipStatus;
    private Boolean ready;

    public Integer getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(Integer caliber25) {
        this.caliber25 = caliber25;
    }

    public Integer getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(Integer caliber30) {
        this.caliber30 = caliber30;
    }

    public Integer getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(Integer caliber50) {
        this.caliber50 = caliber50;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

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

    public void fillShip(String caliber, Integer amount) {
        if (caliber.equals(".25")) {
            caliber25 += amount;
        } else if (caliber.equals(".30")) {
            caliber30 += amount;
        } else if (caliber.equals(".50")) {
            caliber50 += amount;
        }
        Integer allAmount = caliber25 + caliber30 + caliber50;
        shipStatus = (int) (allAmount / 12500D * 100) + "%";
        if(allAmount == 12500){
            ready = true;
            shipStatus = "full";
        } else if (allAmount>12500){
            ready = false;
            shipStatus = "overloaded";
        } else if (allAmount == 0){
            shipStatus = "empty";
        }
    }
}

