package com.historychannel.history;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/hello")
    public String hello(){
        return "Let's learn history stuff";
    }
    public HelloController(){}
}
