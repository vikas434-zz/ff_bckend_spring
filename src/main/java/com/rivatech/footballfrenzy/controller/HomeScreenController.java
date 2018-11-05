package com.rivatech.footballfrenzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeScreenController {

    @GetMapping("/test")
    public String testHomeController(){
        return "hello world";
    }
}
