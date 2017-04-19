package io.pivotal.spring.metrics;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingCounter {

    @Autowired
    private CounterService counterService;

    @Before("execution(* io.pivotal.spring.services.*.*(..))")
    public void countService(JoinPoint joinPoint) {
        counterService.increment(String.format("counter.services.%s.invoked", joinPoint.getSignature().getName()));
    }
}
