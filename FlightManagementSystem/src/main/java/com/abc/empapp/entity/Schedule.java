package com.abc.empapp.entity;

import java.time.LocalTime;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

	private LocalTime departureTime;
	private LocalTime landingTime;
	private String stop;
}
