package com.groot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Status {

    String received;
    Integer amount;
    @JsonProperty(value = "shipstatus")
    String shipStatus;
    Boolean ready;

    public Status(Ship ship, String received, Integer amount){
        this.received = received;
        this.amount = amount;
        this.shipStatus = ship.getShipStatus();
        this.ready = ship.getReady();
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
}

