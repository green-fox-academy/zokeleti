package com.groot.controller;

import com.groot.model.*;
import com.groot.model.Error;
import com.groot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

    private Ship ship;
    private FoodService foodService;

    @Autowired
    public GuardianController(FoodService foodService){
        this.foodService = foodService;
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

    @GetMapping("/drax")
    public ResponseEntity<?> getCalorieTable(){
        return ResponseEntity.ok(foodService.getListOfFoods());
    }

    @PostMapping("/drax/add")
    public void addFood(@RequestBody Food food){
        foodService.addFood(food);
    }

    @DeleteMapping("/drax/delete")
    public void deleteFoodByName(@RequestParam String name){
        foodService.removeFood(name);
    }

    @PutMapping("/drax/changeamount")
    public void changeAmount(@RequestParam String name, @RequestParam Integer newAmount){
        foodService.changeAmount(name, newAmount);
    }

}
