package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.User;
import com.web.spring.service.UserCrudService;

@RestController

@RequestMapping("crudcontroller")

public class UserCrudController {
	@Autowired
	private UserCrudService  service;
	
	// crudcontroller/users
	
	@PostMapping(value = "/users" , consumes = {"application/json"},produces  = {"application/json"})
	public User saveUser(@RequestBody User user) {
		User savedUser =service.saveUser(user);
		return savedUser;
	}
	
	// crudcontroller/users
	
	@GetMapping(value = "/users" ,produces  = {"application/json"})
	public List<User> getAllUsers() {
	return service.getAllUsers();
	}
	
	// crudcontroller/users/101
	
	@GetMapping(value = "/users/{id}" ,produces  = {"application/json"})
	public User getUsers(@PathVariable Integer id) {
	 User user= service.getUsers(id);
		 return user;
		
		}

	
	

}
