package myempapp.util;

import myempapp.model.Employee;

public class ValidateEmployee {

	public boolean validateEmployeeSalary(Employee e)
	{
		return (e.getSalary()<1000)?false:true;
	}
}
