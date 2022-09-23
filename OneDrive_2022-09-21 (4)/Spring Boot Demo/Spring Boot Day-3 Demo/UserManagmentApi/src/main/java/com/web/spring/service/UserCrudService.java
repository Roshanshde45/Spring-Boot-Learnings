package com.web.spring.service;

import java.util.List;
import java.util.Optional;

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
		
		Optional<User> ouser=repo.findById(id);
		
		User u=null;
		
		if(ouser.isPresent()) {
			u=ouser.get();
			return u;
		}
		else {
			return u;
		}
		
			
		}

}
