package myempapp.dto;

public class EmployeeResponseAccountDTO {

	private int id;
	private String name;
	private int bankAccount;
	public EmployeeResponseAccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeResponseAccountDTO(int id, String name, int bankAccount) {
		super();
		this.id = id;
		this.name = name;
		this.bankAccount = bankAccount;
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
	public int getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Override
	public String toString() {
		return "EmployeeResponseAccountDTO [id=" + id + ", name=" + name + ", bankAccount=" + bankAccount + "]";
	}
	
	
}
