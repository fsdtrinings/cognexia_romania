package com.abc.empapp.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seat {

	private String passengerName;
	private String gender;
	private int age;
	private long mobileNumber;
	
}
