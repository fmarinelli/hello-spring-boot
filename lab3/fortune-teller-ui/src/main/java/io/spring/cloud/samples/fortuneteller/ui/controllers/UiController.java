package io.spring.cloud.samples.fortuneteller.ui.controllers;

import io.spring.cloud.samples.fortuneteller.ui.domain.Fortune;
import io.spring.cloud.samples.fortuneteller.ui.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

    @Autowired
    private FortuneService service;

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/greeting")
    public String getGreeting() {
        return greeting;
    }

    @RequestMapping("/random")
    public Fortune randomFortune() {
        return service.randomFortune();
    }
}
