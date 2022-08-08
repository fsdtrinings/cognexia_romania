package p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	@Column(name = "emp_name",nullable = false)
	private String employeeName;
	@Column(unique = true)
	private String email;
	private int salary;
	
	
	// ----------------------------------------------------------------------------------------------------------
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Employee(int id, String employeeName, String email, int salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}

	public Employee(String employeeName, String email, int salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}
	
	// ----------------------------------------------------------------------------------------------------------
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", email=" + email + ", salary=" + salary
				+ "]";
	}
	
	
}
