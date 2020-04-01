package com.example.demoAOP;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyComponent {

    public void sayGoodBye() {
        log.debug("sayGoodBye from MyComponent...");
    }

    public String getComponenet() {
        log.debug("getComponenet from MyComponent...");
        return "getComponenet from MyComponent";
    }

}
