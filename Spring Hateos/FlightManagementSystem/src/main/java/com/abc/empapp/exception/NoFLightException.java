package com.abc.empapp.exception;

import lombok.Data;

@Data
public class NoFLightException extends Exception 
{
	String enteredFlightNumber;
	String msg;
	String className;
	
	public NoFLightException(String enteredFlightNumber, String msg,String className) {
		super();
		this.enteredFlightNumber = enteredFlightNumber;
		this.msg = msg;
		this.className = className;
	}
	
	@Override
	public String toString() {
		return "NoFLightException [enteredFlightNumber=" + enteredFlightNumber + ", msg=" + msg + "]";
	}
	
	
}
