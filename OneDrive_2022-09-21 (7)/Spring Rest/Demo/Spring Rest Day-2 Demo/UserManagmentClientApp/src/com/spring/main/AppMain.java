package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.client.RestTemplateClient;
import com.spring.config.AppConfig;
import com.spring.model.User;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		RestTemplateClient  client = ctx.getBean(RestTemplateClient.class);
		System.out.println("Get User By Id");
		User u=client.getUser();
		System.out.println("Inside Main "+u.getName()+" "+u.getEmail());

	}

}
