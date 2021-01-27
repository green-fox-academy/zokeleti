package com.groot.controller;

import com.groot.model.Error;
import com.groot.model.SpeedCalculator;
import com.groot.model.Translation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

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

}
