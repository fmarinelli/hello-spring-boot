package io.spring.cloud.samples.fortuneteller.ui.services;

import io.spring.cloud.samples.fortuneteller.ui.domain.Fortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FortuneService {

    @Autowired
    private FortuneClient client;

    public Fortune randomFortune() {
        return client.random();
    }

}