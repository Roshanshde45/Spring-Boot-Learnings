package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.reposistory.UserDao;

@RestController
@RequestMapping("dao")
public class UserHibernateController {
	@Autowired
	private UserDao userDao;
	//dao/user
	@PostMapping("/user")
	public User save(@RequestBody User user) {
		User savedUser= userDao.save(user);
		return savedUser;
	}
	
	//dao/user
	@GetMapping("/user")
	public List<User> listUsers() {
		List<User> ulist = userDao.listUsers();
		return ulist;
	}

}
