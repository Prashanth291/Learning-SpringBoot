package com.learn.SimpleWebApp;

import com.learn.SimpleWebApp.Controllers.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SimpleWebAppApplication.class, args);
		 HomeController h = context.getBean(HomeController.class);
		 h.sayHello();
	}

}
