package io.spring.cloud.samples.fortuneteller.ui.services;

import io.spring.cloud.samples.fortuneteller.ui.domain.Fortune;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class FallbackFortuneClient implements FortuneClient {

    @Override
    public Fortune random() {
        return new Fortune(42L, "Your future is unclear.");
    }
}
