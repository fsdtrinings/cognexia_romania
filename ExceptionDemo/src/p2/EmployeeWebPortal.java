package p2;

import p3.SalaryNotInRangeExcption;

public class EmployeeWebPortal {

	Employee allEmployees[];
	
	public EmployeeWebPortal()throws SalaryNotInRangeExcption
	{
		
		Accountant a1 = new Accountant(101,"Mike",1000,"ABC-123");
		Accountant a2 = new Accountant(102,"Mike",2200,"ABC-123");
		
		Developer dev1 = new Developer(102,"Jenny",2200,"Bank - App");
		
		
		
		if(a1.getSalary()<=1000)
		{
			throw new SalaryNotInRangeExcption();
		}
		else
		{
			allEmployees = new Employee[2];
			allEmployees[0] = a1;
			allEmployees[1] = dev1;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		 
		try {
			EmployeeWebPortal webApp = new EmployeeWebPortal();
			webApp.getAllEmployees();
		} 
		catch (SalaryNotInRangeExcption e) {
			System.out.println(e);
		}
		
		
		

	}
	
	public void doLogin(Employee e)
	{
		e.doLogin();
	}
	
	
	public void getAllEmployees()
	{
		/*allEmployees[0] = a1;
		  allEmployees[1] = dev1;
		  
		 * */
		
		for (Employee e : allEmployees) {
			/*
			System.out.print(e.getId()+" - ");
			System.out.print(e.getName()+" - ");
			System.out.print(e.getSalary()+"- ");
			System.out.print(e.getX()+"\n"); // 10
			*/
			
			System.out.println(e);
			
			e.setX(600);
			doLogin(e);  // internally x change to 600
			
			if(e instanceof Accountant)
			{
				// call all account related code
				
				Accountant a = (Accountant)e; // ClassCastException
				// Account a = new Account();  / cannot use , bcoz we loose state of the object
				a.doCreditSalary(); 
				System.out.println(" x :- "+e.getX());
				
			}
			
			if(e instanceof Developer)
			{
				// call all developer related code
				
				Developer dev = (Developer)e; 
				dev.doCoding();
				System.out.println(" x :- "+e.getX());
				
				
			}
			
		
			
			System.out.print("\n-----------------------------\n");
		}
	}
	
	
	

}
