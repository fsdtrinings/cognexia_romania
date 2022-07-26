package p1;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	private int x = 10;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	// ----- behaviour specific to employee
	public void doLogin()
	{
		System.out.println(" \n Employee class - login for  "+this.name+" - x = "+x);
	}
	@Override
	public String toString() {
		
		return id+" - "+name+" - "+salary;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean isSame = false;
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			
			boolean a = (this.getId() == e.getId());
			boolean b = (this.getSalary() == e.getSalary());
			boolean c = (this.getName().equals(e.getName()));
			
			return a && b && c;
			
		}
		

		
		
		return isSame;
		
	}

	
	
	
}




















