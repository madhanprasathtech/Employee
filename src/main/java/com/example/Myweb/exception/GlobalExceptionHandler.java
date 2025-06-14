package com.example.Myweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(LocationException.class)
	public ResponseEntity<Object> getexception(LocationException l){
		return new ResponseEntity<Object>(l.getMessage(),HttpStatus.NOT_FOUND);
		
	}

}
