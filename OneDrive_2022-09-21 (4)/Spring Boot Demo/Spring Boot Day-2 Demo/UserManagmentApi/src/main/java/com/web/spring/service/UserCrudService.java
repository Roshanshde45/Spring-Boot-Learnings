package com.web.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.bean.User;
import com.web.spring.reposistory.UserCrudReposistory;

@Service
public class UserCrudService {
	@Autowired
	private  UserCrudReposistory repo;
	
	public User saveUser(User user) {
		User savedUser =repo.save(user);
		return savedUser;
	}
	
	public List<User> getAllUsers() {
	return (List<User>) repo.findAll();
	}
	
	public User getUsers(Integer id) {
		 User user= repo.findById(id).get();
		 return user;
		
		}

}
