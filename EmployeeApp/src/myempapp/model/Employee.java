package myempapp.model;

import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String name;
	private int salary;
	private int bankAccount;
	private String education;
	
	private int x = 10;
	
	private transient Project project;
	
	
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
	
	
	public int getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
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
		
		return " To String :- "+id+" - "+name+" - "+salary+" - "+bankAccount+" - "+education;
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

	
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
        	
		stream.defaultWriteObject();
		System.out.println(" inside manual write operation ");
		stream.writeChars(project.getProjectName());
    }

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        
    	System.out.println(" inside manual read operation ");
    	
    	
    	
    	stream.defaultReadObject();
    	String projectName = stream.readLine();
        
        Project p = new Project(projectName);
        this.project = p;
    }
	
	
	
	
	
}//end class




















