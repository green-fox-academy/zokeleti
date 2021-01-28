package com.groot.controller;

import com.groot.model.*;
import com.groot.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    private Ship ship;

    @Autowired
    public GuardianController(){
        this.ship = new Ship();
    }

    @GetMapping("/groot")
    public ResponseEntity<?> groot(@RequestParam(required = false) String message){
        if(message == null){
            return ResponseEntity.badRequest().body(new Error());
        }
        return ResponseEntity.ok(new Translation(message));
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> yondu(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time){
        if(distance == null || time == null || time == 0){
            return ResponseEntity.badRequest().body(new Error());
        }
        return ResponseEntity.ok(new SpeedCalculator(distance, time));
    }

    @GetMapping("/rocket")
    public ResponseEntity<Ship> getCargo(){
        return ResponseEntity.ok(ship);
    }

    @PostMapping("/rocket/fill")
    public ResponseEntity<?> fillShip(@RequestParam (required = false) String caliber, @RequestParam(required = false) Integer amount){
        if(caliber == null || amount == null){
            return ResponseEntity.badRequest().body(new Error());
        }
        ship.fillShip(caliber, amount);
        return ResponseEntity.ok(new Status(ship, caliber, amount));
    }

    //@GetMapping("/dra")



}
