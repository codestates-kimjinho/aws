package com.example.aws.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test/{param}")
    public String test(@PathVariable String param){
        return "Hello " + param;
    }
}
