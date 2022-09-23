package com.spring.reposistory;

import java.util.List;

import com.spring.model.User;

public interface UserDao {
	public User save(User user);
	List<User> listUsers(); 

}
