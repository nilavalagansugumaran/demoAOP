package com.example.demoAOP;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyOtherService {

    public void sayHello(String name) {
        log.debug("sayHello from MyOtherService...");
    }

    private void setComponenet() {
        log.debug("setComponenet from MyOtherService...");
    }
}
