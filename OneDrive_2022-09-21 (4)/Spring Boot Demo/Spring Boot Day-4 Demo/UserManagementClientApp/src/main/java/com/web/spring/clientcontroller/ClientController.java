package com.web.spring.clientcontroller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.User;
import com.web.spring.clientservice.ClientService;

@RestController
@RequestMapping("clentapp")
public class ClientController {
	
	@Autowired
	
	private ClientService service;
	// clentapp/users
	@GetMapping(value = "/users")
	public User[] getUsers() {
		return service.getUsers();
		}
	
@PostMapping(value = "/users")
public User addUser(@RequestBody User user) {
		
	return service.addUser(user);
		
	}



}
