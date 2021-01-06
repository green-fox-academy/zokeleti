package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {
    AtomicLong initialValue = new AtomicLong(0);
    Greeting greeting = new Greeting(initialValue, "Szevasz ");
    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        greeting.content = new Greeting(initialValue, "Szevasz").getContent() + name;
        greeting.greetCount.set(greeting.greetCount.get() + 1L);
        return greeting;
    }


}
