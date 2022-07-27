package myempapp.util;

import myempapp.dto.EmployeeResponseAccountDTO;
import myempapp.dto.EmployeeResponseHRDTO;
import myempapp.model.Employee;

public class DTOConvertor {
	
	public static EmployeeResponseAccountDTO convertEmployeeToAccountDTO(Employee e)
	{
		return new EmployeeResponseAccountDTO(e.getId(),e.getName(), e.getBankAccount());
	}
	
	public static EmployeeResponseHRDTO convertEmployeeToHRDTO(Employee e)
	{
		return new EmployeeResponseHRDTO(e.getId(),e.getName(), e.getEducation()); 
	}
	
	

}
