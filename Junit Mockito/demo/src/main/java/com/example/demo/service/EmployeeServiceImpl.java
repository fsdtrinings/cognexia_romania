package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.EmployeeDAO;

@Service
public class EmployeeServiceImpl {

	@Autowired
	EmployeeDAO empRepository;
	
	public List<Employee> getAllEmployees()throws Exception
	{
		List<Employee> allEmployees = empRepository.getAllEmployees();
		if(allEmployees.size()>0)
		{
			return allEmployees;
		}
		else
		{
			throw new Exception("No Employee Found");
		}
	}
	
	public int getEmployeeSalaryByName(String empName)throws Exception
	{
		int salary = empRepository.getSalary(empName);
		if(salary!=0) return salary;
		else throw new Exception(empName+" not found");
	}
	
	
	public Employee getEmployeeByName(String name)throws Exception
	{
		Employee e = empRepository.getEmployeeByName(name);
		if(e != null) return e;
		else throw new Exception("Invalid employee name");
	}
	
	public List<Employee> getAllEmployeeByLocation(String location)throws Exception
	{
		List<Employee> allEmployees = empRepository.getEmployeeByLocation(location);
		if(allEmployees.isEmpty() == false) return allEmployees;
		else throw new Exception("Invalid employee location");
	}
	
	
}
