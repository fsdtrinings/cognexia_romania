package com.myapp.entity;

import java.util.Arrays;
import java.util.List;

public class Users {

	String username;
	String password;
	String role;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
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
	
	
}
