package io.pivotal.spring.controllers;

import io.pivotal.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String hello() {
        return String.format("%s World!", greetingService.getGreeting());
    }
}
