package com.gpr.apps.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    
    @GetMapping("/data")
    public String getData() {
        return "Hello!";
    }
    
}
