package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String hello() {
        return "Hello from rest controller";
    }
}
