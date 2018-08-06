package com.white.rateobserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.white.rateobserver.service" })
public class RateObserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(RateObserverApplication.class, args);
    }
}
