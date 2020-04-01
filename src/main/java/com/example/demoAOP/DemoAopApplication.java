package com.example.demoAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);

		//Join points - are the method calls
		context.getBean(MyService.class).sayGoodBye();
		context.getBean(MyService.class).getComponenet();
		context.getBean(MyService.class).sayHello("nila - MyService");

		context.getBean(MyOtherService.class).sayHello("nila - MyOtherService");


		context.getBean(MyComponent.class).sayGoodBye();
		context.getBean(MyComponent.class).getComponenet();

		context.getBean(MyOtherComponent.class).sayHello("nila - MyOtherService");
		context.getBean(MyOtherComponent.class).getComponenet();

	}

}
