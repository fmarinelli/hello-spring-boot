package io.spring.cloud.samples.fortuneteller.ui.services;

import io.spring.cloud.samples.fortuneteller.ui.domain.Fortune;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "http://fortune", fallback = FallbackFortuneClient.class)
public interface FortuneClient {

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    Fortune random();
}
