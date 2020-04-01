package com.example.demoAOP;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyService {

    public void sayHello(String name) {
        log.debug("sayHello from MyService...");
    }

    public void sayGoodBye() {
        log.debug("sayGoodBye from MyService...");
    }


    public String getComponenet() {
        log.debug("getComponenet from MyService...");
        return "getComponenet from MyService";
    }

    private void setComponenet() {
        log.debug("setComponenet from MyService...");
    }
}
