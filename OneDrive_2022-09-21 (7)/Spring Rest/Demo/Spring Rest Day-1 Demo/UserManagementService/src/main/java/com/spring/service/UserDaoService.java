package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.User;

@Service
public class UserDaoService {

private static List<User> users=new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam","adam@Gmail.com"));
		users.add(new User(2,"Eve","eve@Gmail.com"));
		users.add(new User(3,"Jack","jack@Gmail.com"));
	}
	
	public List<User>  getAllUsers (){
		return users;
	}
	
	public User save(User user) {
		users.add(user);
		return user;
		
	}
	
	
	

}
