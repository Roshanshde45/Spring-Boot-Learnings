package com.spring.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spring.model.User;
import com.spring.service.UserDaoService;
@RestController
@RequestMapping("userapi")
public class UserController {
	@Autowired
	private UserDaoService service;
	
	
	//   /userapi/greet
	@RequestMapping( value = "/greet" , method = RequestMethod.GET)
	public String greet() {
	return "Welcome to User Management Service";
		
	}
	
//  /userapi/user
	
	@RequestMapping( value = "/user" , method = RequestMethod.GET)
	public User getUser() {
	return new User(101, "Ravic","r@gmail.com");
	}
//  /userapi/user/101/Ravic/r@gmail
	@GetMapping(value = "/user/{id}/{name}/{email}")
	public User getUser1(@PathVariable Integer id,@PathVariable String name,@PathVariable String email) {
	return new User(id, name,email);
	}
	
//  /userapi/users
	
    @GetMapping(value = "/users",produces = {"application/json"})
	public List<User>  getAllUsers (){
		return service.getAllUsers();
	}
	
//  /userapi/users1
    // 
    
    @GetMapping(value = "/users1",produces = {"application/json","application/xml"})
	public List<User>  getAllUsersXmlJson (){
		return service.getAllUsers();
	}
	
    
//  /userapi/users
	
    @PostMapping(value = "/users",produces = {"application/json"},consumes ={"application/json"})
	public User  createUsers (@RequestBody User user){
		return service.save(user);
	}

}
