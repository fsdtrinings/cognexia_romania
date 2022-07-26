package p1;

public class Accountant extends Employee implements Verification
{
	
	private String bankKey ;
	
	
	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Accountant(int id, String name, int salary,String key) {
		super(id, name, salary);
		this.bankKey = key;
	}



	public void doCreditSalary()
	{
		System.out.println("Accountant - credit salary "+bankKey);
	}



	@Override
	public boolean thirdPartyEmployeeVerfication() {
		// some code to verify employee
		// 1. govt verification 
		
		// 2. accountant country group verification 
		
		return true;
	}
	
	

}
