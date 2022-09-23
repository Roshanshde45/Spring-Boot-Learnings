package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.bean.User;
import com.web.spring.service.UserService;

@RestController
@RequestMapping("userapi")
public class UserController {
	
	@Autowired
	// userapi/users
	private UserService service;
	@GetMapping(value = "/users" ,produces = {"application/json","application/xml"})
	List<User>  getAllUsers(){
		return service.getAllUsers();
		
	}
	// userapi/users
	
	@PostMapping(value = "/users" ,produces = {"application/json"} ,consumes = {"application/json"})
	User  saveUser(@RequestBody User user){
		return service.createUsers(user);
		
	}
	

}
