package com.example.demo;

import org.springframework.stereotype.Component;


@Component
public class Employee {

	private String name;
	private int salary;
	private String location;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int salary, String location) {
		super();
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
