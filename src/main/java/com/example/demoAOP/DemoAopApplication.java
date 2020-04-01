package com.example.demoAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);
	}

}
