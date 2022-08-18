package com.abc.secureapp.dto;

import org.springframework.stereotype.Component;

@Component
public class AppUserRequestDTO {
	
	private String username;
	private String password;
	
	public AppUserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUserRequestDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "AppUserRequestDTO [username=" + username + ", password=" + password + "]";
	}
	
	

}
