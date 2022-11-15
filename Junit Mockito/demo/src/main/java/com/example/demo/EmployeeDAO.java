package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	public  List<Employee> getAllEmployees()
	{
		Employee e1 = new Employee("A",2000, "Delhi");
		Employee e2 = new Employee("B",3000, "Banglore");
		Employee e3 = new Employee("C",4000, "Pune");
		Employee e4 = new Employee("D",5000, "Chennai");
		
		return Arrays.asList(e1,e2,e3,e4);
	}
	
	public int getSalary(String empName) {
		
		List<Employee> allEmployees = getAllEmployees();
		return allEmployees.stream().filter((e)->{
			return (e.getName().equalsIgnoreCase(empName))?true:false;
		}).findFirst().get().getSalary();
	}
	
	public Employee getEmployeeByName(String name)
	{
		List<Employee> allEmployees = getAllEmployees();
		return allEmployees.stream().filter((e)->{
			return (e.getName().equalsIgnoreCase(name))?true:false;
		}).findFirst().get();
	}
	
	public List<Employee> getEmployeeByLocation(String name)
	{
		List<Employee> allEmployees = getAllEmployees();
		return allEmployees.stream().filter((e)->{
			return (e.getLocation().equalsIgnoreCase(name))?true:false;
		}).collect(Collectors.toList());
	}
	
}
