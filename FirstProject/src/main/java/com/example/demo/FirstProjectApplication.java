package com.example.demo;

import org.springframework.aop.framework.AopContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();	
	}
	
}
