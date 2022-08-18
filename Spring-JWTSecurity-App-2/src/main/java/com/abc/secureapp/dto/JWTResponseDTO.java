package com.abc.secureapp.dto;

import org.springframework.stereotype.Component;

@Component
public class JWTResponseDTO {

	private String token;
	private String username;
	private boolean isValid;

	public JWTResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JWTResponseDTO [token=" + token + ", username=" + username + ", isValid=" + isValid + "]";
	}

	public JWTResponseDTO(String token, String username, boolean isValid) {
		super();
		this.token = token;
		this.username = username;
		this.isValid = isValid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


	
	
}
