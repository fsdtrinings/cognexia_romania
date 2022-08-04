package p1.entity;

import java.util.List;

public class MyUser {
	
	private String username;
	private String password;
	private String role;
	private String projectName;
	private List<String> taskName;
	
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MyUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public MyUser(String username, String password, String role, String projectName) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.projectName = projectName;
	}


	public MyUser(String username, String password, String role, String projectName, List<String> taskName) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.projectName = projectName;
		this.taskName = taskName;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<String> getTaskName() {
		return taskName;
	}


	public void setTaskName(List<String> taskName) {
		this.taskName = taskName;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", role=" + role + ", projectName="
				+ projectName + ", taskName=" + taskName + "]";
	}
	
	

}
