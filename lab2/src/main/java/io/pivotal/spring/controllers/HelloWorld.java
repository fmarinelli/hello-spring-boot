package io.pivotal.spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/")
    public String hello() {
        return String.format("%s World!", greeting);
    }
}
