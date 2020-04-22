package com.yifan.spring.springsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yifan.spring.springsession.controller")
public class SpringsessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsessionApplication.class, args);
	}

}
