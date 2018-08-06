package com.white.rateobserver.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Qualifier("service")
public class Service {

//    @Autowired
//    RequestResult requestResult;

    private static AtomicInteger counter = new AtomicInteger();

    @GetMapping("/get")
    public RequestResult get(@RequestParam(name = "type", required = false, defaultValue = "default") String type) {
        RequestResult requestResult = new RequestResult();
        requestResult.setId(counter.incrementAndGet());
        requestResult.setType(type);
        return requestResult;
    }
}
