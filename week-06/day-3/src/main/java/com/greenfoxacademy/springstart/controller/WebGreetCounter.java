package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounter {
    AtomicLong counter = new AtomicLong(1L);
    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", " " + name );
        model.addAttribute("counter", counter.getAndIncrement());
        return "greeting";
    }
}
