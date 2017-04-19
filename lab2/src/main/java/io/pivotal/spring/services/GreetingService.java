package io.pivotal.spring.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    @Value("${greeting}")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }
}