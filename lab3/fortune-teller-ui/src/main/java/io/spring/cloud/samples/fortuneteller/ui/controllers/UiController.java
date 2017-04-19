package io.spring.cloud.samples.fortuneteller.ui.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/greeting")
    public String getGreeting() {
        return greeting;
    }
}
