package com.springboot.vaibhav.module1introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Paying...");
    }

    //CONCEPT of @PostConstruct and @preDestroy
    @PostConstruct
    public void afterinit() {
        System.out.println("Before Paying...");
    }

    @PreDestroy
    public void afterdestroy() {
        System.out.println("After Paying...");
    }
}
