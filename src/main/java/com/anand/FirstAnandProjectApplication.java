package com.anand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anand.service.HelloService;

@SpringBootApplication
public class FirstAnandProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstAnandProjectApplication.class, args);
	HelloService helloService=context.getBean("helloService",HelloService.class);
	System.out.println(helloService.sayHello("Anand"));
	helloService.playGame();
	}

}
