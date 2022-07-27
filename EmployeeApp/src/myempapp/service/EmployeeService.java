package myempapp.service;

import java.util.List;

import myempapp.dto.EmployeeResponseAccountDTO;
import myempapp.dto.EmployeeResponseHRDTO;
import myempapp.exception.InvalidSalaryException;
import myempapp.model.Employee;

public interface EmployeeService {
	
	public boolean createEmployee(Employee e)throws InvalidSalaryException;
	public Employee getEmployeeBasedOnId(int id);
	public List<Employee> getEmployeeBasedOnProject(String projectName);
	public List<Employee> getAllEmployees();
	
	// ----- accessed by Accounts team 
	
		public EmployeeResponseAccountDTO getEmployeeForAccountsTeam(int id);
		
		
	// ----- accessed by HR team 
		
		public EmployeeResponseHRDTO getEmployeeForHRTeam(int id);
		
		
		

}


