package p2;

public class Developer extends Employee implements TechnicalCertification,Verification
{

	String projectname = "MyBankApp";
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String name, int salary,String projectname) {
		super(id, name, salary);
		this.projectname = projectname;
	}


	
	@Override
	public String clearCertification(String lanaguge) {
		
		return "OCP-Developer";
	}
	
	

	@Override
	public boolean thirdPartyEmployeeVerfication() {
		
		// govt verification 
		
		// verify certification
		
		return true;
	}

	public void doCoding()
	{
		System.out.println("Develoer - Do Coding "+projectname);
	}
}//end developer
