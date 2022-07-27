package p1;

import java.io.IOException;
import java.sql.SQLException;

public class ServiceCode {

	public void doBusinessUseCase(Employee employee) {
	

		System.out.println(" Security code - 1");

		System.out.println(" Logging code ");

		try {
			employee.doThings();
		} catch (Exception e) {
			System.out.println("Inside catch :- "+e.getMessage());
		}
		

		System.out.println(" Deallocating memory code ...");
	}



	public void useCase2(int x)throws IOException, SQLException
	{
		if(x > 100)
		{
			// we should raise an Exception 
			IOException exp = new IOException("New Test Exception");
			throw exp;
		}
		else
		{
			System.out.println("Some Io work");
		}
		
	}



}
