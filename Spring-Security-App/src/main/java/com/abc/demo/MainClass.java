package com.abc.demo;

class Employee
{
	int empId;
	String name;
	int salary;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee setId(int id)
	{
		this.empId = id;
		return this;
	}
	
	public Employee setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Employee setSalary(int salary)
	{
		this.salary = salary;
		return this;
	}
	
	

}


public class MainClass {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(101);
		System.out.println(e);
		e.setName("Mike").
		setSalary(2000);
		
		System.out.println(e);
	}
	
}
