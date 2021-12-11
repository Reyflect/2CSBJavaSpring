package com.example.demo.controller;

import com.example.demo.computations.Computation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {
    @RequestMapping("/hello")
    public String hello(){
        return "Test " + Computation.Subtraction();
    }
    @RequestMapping("/hi")
    public String hi(){
        return "hi world";
    }
    @RequestMapping("/rastaman")
    public String rastaman(){
        return "Rastaman";
    }
    @RequestMapping("/rastaman/desc")
    public String desc(){
        return "Hap human hap zoombie";
    }
}
