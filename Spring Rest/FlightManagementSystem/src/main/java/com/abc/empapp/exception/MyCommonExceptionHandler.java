package com.abc.empapp.exception;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyCommonExceptionHandler
{

	public MyCommonExceptionHandler() {
	
		System.out.println("Inside MyCommonExceptionHandler contructor ...");
	}

	@ExceptionHandler
	public ResponseEntity<MyExceptionTemplate> handlingNoSuchElementException(java.util.NoSuchElementException exception)
	{
		// code to configure what to return (Exception tempalate)
		System.out.println(" --- inside No Element exception ");
		MyExceptionTemplate template = new MyExceptionTemplate();
		
		template.setTodayDate(LocalDate.now());
		template.setTodayTime(LocalTime.now());
		template.setUrl("/flight/<flight id>");
		template.setClassName("Flightcontroller");
		template.setCustomMsg(exception.getMessage());
		template.setSolution("Verify the Flight ID and try again");
			
		return new ResponseEntity<MyExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
				
	}
	
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionTemplate> handlingNoFlightExceptions(NoFLightException exception)
	{
		
		System.out.println(" --- inside No flight exception ");
		
		MyExceptionTemplate template = new MyExceptionTemplate();
		
		template.setTodayDate(LocalDate.now());
		template.setTodayTime(LocalTime.now());
		template.setUrl("/flight/"+exception.getEnteredFlightNumber());
		template.setClassName(exception.getClassName());
		template.setCustomMsg(exception.getMsg());
		template.setSolution("Verify the Flight ID and try again");
			
		return new ResponseEntity<MyExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
				
	}
	
	
	
	
	
	
}
