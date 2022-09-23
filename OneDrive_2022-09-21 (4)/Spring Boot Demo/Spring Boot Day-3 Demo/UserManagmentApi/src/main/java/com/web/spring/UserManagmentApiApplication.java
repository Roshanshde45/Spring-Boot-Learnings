package com.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagmentApiApplication.class, args);
		System.out.println("User Managment API is Running..");
	}

}

