package com.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserManagementClientAppApplication {
	
	@Bean
	public RestTemplate getTemplate() {
	RestTemplate template= new RestTemplate();
	return template;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(UserManagementClientAppApplication.class, args);
		System.out.println("Client App is running");
	}

}
