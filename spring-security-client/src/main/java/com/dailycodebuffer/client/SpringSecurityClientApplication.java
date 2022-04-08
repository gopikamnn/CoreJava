package com.dailycodebuffer.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityClientApplication {

	public static void main(String[] args) {

		SpringApplication app= new SpringApplication(SpringSecurityClientApplication.class);
		app.setWebApplicationType(WebApplicationType.REACTIVE);
		SpringApplication.run(SpringSecurityClientApplication.class, args);
	}

}
