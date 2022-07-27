package p1;

import java.io.IOException;
import java.sql.SQLException;

class Employee
{
	
	public void doThings()
	{
		System.out.println("Employee - Do Things ");
	}
}


public class Demo1 {
	
	
	public static void main(String[] args) {
		
		ServiceCode service = new ServiceCode();
		
		try {
			service.useCase2(5000);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		
		
	}
	
	

}
