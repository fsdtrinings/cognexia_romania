package myempapp.databasemock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import myempapp.model.Employee;

public class MyDataBase {
	
	static List<Employee> allEmployees = new LinkedList();
	
	static {
		Employee e1 = new Employee(101,"A",2000);
		Employee e2 = new Employee(102,"B",3000);
		Employee e3 = new Employee(103,"C",17000);
		
		e1.setBankAccount(1);
		e2.setBankAccount(2);
		e3.setBankAccount(3);
		
		e1.setEducation("java");
		e2.setEducation("oracle");
		e3.setEducation("salesforce");
		
		
			
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		
	}

	public static List<Employee> getAllEmployees() {
		return allEmployees;
	}

	public static boolean addEmployee(Employee e)
	{
		boolean result =  allEmployees.add(e);   // insert query of DB operations
		
		//System.out.println("--->> "+allEmployees.size());
		return result;
	}
	
	public static Employee getEmployeeBasedOnId(int searchId)
	{
		for (Employee employee : allEmployees) {   // replace Select query of DB 
			if(employee.getId() == searchId)
			{
				return employee;
			}
		}
		
		return null;
	}
	

}
