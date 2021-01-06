package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class GreetCounter {
    long counter = 0;
    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        Greeting greeting = new Greeting(new AtomicLong(counter), "Szevasz" + name);
        counter += 1;
        return greeting;
    }
}
