package com.web.spring.bean;
import java.util.List;
public class User {
	private Integer uId;
	private String name;
	private String email;
	
		
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(Integer uId, String name, String email) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
		

}
