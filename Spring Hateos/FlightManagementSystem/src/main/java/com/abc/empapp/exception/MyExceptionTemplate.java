package com.abc.empapp.exception;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyExceptionTemplate {

	LocalDate todayDate;
	LocalTime todayTime;
	String url;
	String className;
	String customMsg;
	String solution;
	
}
