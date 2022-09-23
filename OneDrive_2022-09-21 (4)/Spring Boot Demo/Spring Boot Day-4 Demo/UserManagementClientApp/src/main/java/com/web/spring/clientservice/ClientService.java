package com.web.spring.clientservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.web.spring.bean.User;

@Service
public class ClientService {
	@Autowired
	RestTemplate template;
	
	private String uri= "http://localhost:8082/userapi";
	
	public User[] getUsers() {
	
	User u []= template.getForObject(uri+"/users/", User[].class);
	
	for(User users:u) {
		System.out.println(users.getuId() +" "+users.getName());
	}
	return u;
	}

	public User addUser(User user) {
		
		HttpHeaders reqHeaders = new HttpHeaders();
		
		reqHeaders.setContentType(MediaType.APPLICATION_JSON);
		reqHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<User>  reqEntity =new HttpEntity<User>(user,reqHeaders);
		
		ResponseEntity<User>  responseEntitity =  
				template.exchange(uri+"/users", HttpMethod.POST,reqEntity,User.class);
		
		return  responseEntitity.getBody();
		
	}
	
	
	
}
