package myempapp.dto;

public class EmployeeResponseHRDTO {
	
	private int id;
	private String name;
	private String education;
	public EmployeeResponseHRDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeResponseHRDTO(int id, String name, String education) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
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
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "EmployeeResponseHRDTO [id=" + id + ", name=" + name + ", education=" + education + "]";
	}
	
	

}
