package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.exception.ErrorResponse;
import com.spring.exception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(UserNotFoundException.class)       
	    public ResponseEntity<ErrorResponse> handleUserNotFoundException (UserNotFoundException ex) {
	    	ErrorResponse errorResponse = new ErrorResponse();
	    	errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
	    	errorResponse.setErrorMessage(ex.getMsg());
	    	return   new ResponseEntity<ErrorResponse>  (errorResponse,HttpStatus.OK);
	    	
	    }
	 
	 
	 @ExceptionHandler(Exception.class)       
	    public ResponseEntity<ErrorResponse> genericExceptionHandler (Exception ex) {
	    	ErrorResponse errorResponse = new ErrorResponse();
	    	errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	    	errorResponse.setErrorMessage("Server is down");
	    	return   new ResponseEntity<ErrorResponse>  (errorResponse,HttpStatus.OK);
	    	
	    }
}
