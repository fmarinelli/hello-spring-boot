package io.spring.cloud.samples.fortuneteller.hystrixdashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HystrixController {

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }
}
