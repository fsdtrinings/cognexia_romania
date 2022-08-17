package com.abc.empapp.exception;

import java.util.Map;
import java.util.List;
import java.util.HashMap;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.validation.ObjectError;
import org.springframework.validation.FieldError;


@ControllerAdvice
public class ServerSideValidations extends ResponseEntityExceptionHandler 
{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exp,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		
		
	
		System.out.println("Inside ValidationExceptions");
		Map<String, String> errorMap = new HashMap<>();
		
		
		List<ObjectError> errorList = exp.getBindingResult().getAllErrors();

		errorList.stream().forEach((e)->{
			String propertyName = ((FieldError)e).getField();
			String errorMsg = e.getDefaultMessage();
			
			errorMap.put(propertyName, errorMsg);
		});
		
		
		return new ResponseEntity<Object>(errorMap,HttpStatus.BAD_REQUEST);
		
	}

}
