package com.web.spring.exception;

public class UserNotFoundException extends RuntimeException {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public UserNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
	
	

}
