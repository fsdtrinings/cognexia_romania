package p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable(value = true)
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {

	@Id
	private int id;
	@Column(name = "emp_name",nullable = false)
	private String employeeName;
	@Column(unique = true)
	private String email;
	private int salary;
	private int age;
	
	@Embedded
	private Address peraddress;
	
	@Embedded
	@AttributeOverrides({
	      @AttributeOverride(name = "houseNumber", column = @Column(name = "Temp_HouseNumber", length = 20)),
	      @AttributeOverride(name = "city", column = @Column(name = "Temp_city")),
	      @AttributeOverride(name = "country", column = @Column(name = "Temp_country"))
	    })
	private Address temporaryAddress;
	
	@ElementCollection
	
	@CollectionTable(name="EmpDependent", joinColumns=@JoinColumn(name = "empCode"))
	private List<EmployeeDependent> allDependents;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wsNumber")
	private WorkStation workStation;
	
	
	
	
	
	
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
	
	
	
	public WorkStation getWorkStation() {
		return workStation;
	}

	public void setWorkStation(WorkStation workStation) {
		this.workStation = workStation;
	}

	public List<EmployeeDependent> getAllDependents() {
		return allDependents;
	}

	public void setAllDependents(List<EmployeeDependent> allDependents) {
		this.allDependents = allDependents;
	}

	public Address getPeraddress() {
		return peraddress;
	}

	public void setPeraddress(Address peraddress) {
		this.peraddress = peraddress;
	}

	

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
				+ ", age=" + age + "]";
	}
	
	
	
	
}
