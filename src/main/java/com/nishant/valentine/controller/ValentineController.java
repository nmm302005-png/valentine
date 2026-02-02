package com.nishant.valentine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValentineController {

    @GetMapping("/")
    public String home() {
        System.out.println("She opened the link 😳");
        return "valentine";
    }

    @PostMapping("/yes")
    public String yes() {
        System.out.println("She said YES ❤️");
        return "yes";
    }
}
