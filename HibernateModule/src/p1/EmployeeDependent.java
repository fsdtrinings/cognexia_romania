package p1;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeDependent {
	
	private String name;
	private int age;
	private String gender;
	private String relationship;
	public EmployeeDependent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDependent(String name, int age, String gender, String relationship) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.relationship = relationship;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	

}
