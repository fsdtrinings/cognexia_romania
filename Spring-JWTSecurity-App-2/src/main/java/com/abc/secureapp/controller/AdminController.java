package com.abc.secureapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.secureapp.entity.AppUsers;
import com.abc.secureapp.service.AppUserService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AppUserService appUserService;
	
	
	@PostMapping("/saveusers")
	public AppUsers addUsers(@RequestBody AppUsers appUsers)
	{
		return   appUserService.saveUsers(appUsers);
	}
	
	@GetMapping("/users")
	public String doSomeAdminWork()
	{
		return  "admin calls get all users list";
	}
	
	

}
