package com.spring.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.spring.model.User;
@Service
public class RestTemplateClient {
	@Autowired 
	RestTemplate  template;
	final  String baseUrl ="http://localhost:8082/UserManagementService/userapi/";
	
	public User getUser() {
	User user=  template.getForObject(baseUrl+"user1/1", User.class);
	System.out.println("Inside  RestTemplateClient "+user);
	return user;
	}
	
}
