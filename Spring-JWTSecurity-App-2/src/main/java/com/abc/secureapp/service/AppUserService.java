package com.abc.secureapp.service;

import org.springframework.stereotype.Service;

import com.abc.secureapp.entity.AppUsers;

import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public interface AppUserService extends UserDetailsService{
	public AppUsers saveUsers(AppUsers appUsers);  // business related method : functional requirement

	public AppUsers getAllUsersByRole(String role);
	
}
