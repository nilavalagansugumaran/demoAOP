package com.example.demoAOP;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {

    @Before("execution(* say*(*))") // point cut expression
    public void logForSay(JoinPoint jp){

        // Advice
        log.debug("MyAspect called - logForSay {}, {}, {}, {} ", jp.getSignature(), jp.getArgs(), jp.getTarget(), jp.getThis());
    }
}
