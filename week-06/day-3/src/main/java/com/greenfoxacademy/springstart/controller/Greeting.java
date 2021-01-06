package com.greenfoxacademy.springstart.controller;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    public Greeting(AtomicLong greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public AtomicLong greetCount;
    public String content;


    public void setGreetCount(AtomicLong greetCount) {
        this.greetCount = greetCount;
    }


    public AtomicLong getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }
}
