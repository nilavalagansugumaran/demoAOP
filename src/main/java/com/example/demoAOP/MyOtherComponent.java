package com.example.demoAOP;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyOtherComponent {


    public void sayHello(String name) {
        log.debug("sayHello from MyOtherComponent...");
    }

    public void sayGoodBye() {
        log.debug("sayGoodBye from MyOtherComponent...");
    }


    public String getComponenet() {
        log.debug("getComponenet from MyOtherComponent...");
        return "getComponenet from MyOtherComponent";
    }

    private void setComponenet() {
        log.debug("setComponenet from MyOtherComponent...");
    }
}
