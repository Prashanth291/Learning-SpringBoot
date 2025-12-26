package com.Hello.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HelloApplication.class, args);

		dev p = context.getBean(dev.class);

		p.display();
	}

}
