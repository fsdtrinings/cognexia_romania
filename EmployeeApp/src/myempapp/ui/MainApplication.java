package myempapp.ui;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import myempapp.dto.EmployeeResponseAccountDTO;
import myempapp.dto.EmployeeResponseHRDTO;
import myempapp.exception.InvalidSalaryException;
import myempapp.model.Employee;
import myempapp.service.EmployeeService;
import myempapp.service.EmployeeServiceImpl;

public class MainApplication {

	EmployeeService employeeService;
	
	public MainApplication() {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		
		MainApplication webportal = new MainApplication();
		
		try {
			
			while(true)
			{
				System.out.println("\n 1. Create Employee ");
				System.out.println("\n 2. Get All Employee");
				System.out.println("\n 3. Get Employee By ID - Accounts ");
				System.out.println("\n 4. Get Employee By ID - HR ");
				System.out.println("\n 0. EXIT");
				
				System.out.println("\n Enter User Option :- ");
				switch (new Scanner(System.in).nextInt()) 
				{
				
				case 1:
					webportal.createEmployee();
					break;
					
				case 2:
					webportal.renderEmployees();
					break;
					
				case 3:
					webportal.getEmployeeForAccounts();
					break;
					
				case 4:
					webportal.getEmployeeForHR();
					break;
					
					

				default:
					break;
				}//end switch
				
			}//end while
			
			
		} catch (InvalidSalaryException e) {
			System.out.println(e);
		}//end catch
	}//end main

	public void getEmployeeForAccounts()
	{
		System.out.println("Enter Employee ID ");
		int searchId = new Scanner(System.in).nextInt();
		
		EmployeeResponseAccountDTO e = employeeService.getEmployeeForAccountsTeam(searchId);
		
		System.out.println(e);
		
	}
	public void getEmployeeForHR()
	{
		
		System.out.println("Enter Employee ID ");
		int searchId = new Scanner(System.in).nextInt();
		
		EmployeeResponseHRDTO e = employeeService.getEmployeeForHRTeam(searchId);
		
		System.out.println(e);
	}
	
	
	
	
	public void renderEmployees()
	{
		List<Employee> allEmployees = employeeService.getAllEmployees();
		
		for (Employee employee : allEmployees) {
			System.out.println(employee);
			System.out.println("\n----------------------------------------\n");
		}
		
	}
	
	public void createEmployee()throws InvalidSalaryException
	{
		 // data comes from HTML form
		int id = new Random().nextInt();
		int bankAccount = new Random().nextInt(1000);
		Employee e = new Employee(id, "D", 1400);
		e.setBankAccount(bankAccount);
		e.setEducation("Angular");
		
		boolean status = employeeService.createEmployee(e);
		
		if(status)
		{
			System.out.println(" Employee Saved ");
		}
		else
		{
			System.out.println(" Contact to Custom Care :- care@abc.com");
		}
		
	}
}
