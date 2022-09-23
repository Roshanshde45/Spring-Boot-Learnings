package com.web.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.web.spring.exception.ErrorResponse;
import com.web.spring.exception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> hadnleUserNotFoundException(UserNotFoundException ufe){
		ErrorResponse res =new ErrorResponse();
		res.setErrorCode(HttpStatus.NOT_FOUND.value());
		res.setErrorMessage(ufe.getMsg());
		return new ResponseEntity<ErrorResponse>(res,HttpStatus.OK);
		
	}

}
