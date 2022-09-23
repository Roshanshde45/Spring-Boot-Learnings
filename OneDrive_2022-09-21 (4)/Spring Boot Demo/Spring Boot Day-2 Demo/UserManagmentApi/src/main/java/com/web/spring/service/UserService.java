package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.spring.bean.User;

@Service
public class UserService {
	
	private static List<User> users=new ArrayList<>();
	static {
		
		users.add(new User(1,"Adam","adam@gmal.com"));
		users.add(new User(2,"Eve","eve@gmal.com"));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User createUsers(User user){
		users.add(user);
		return user;
	}

}
