package com.abc.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class MyEmployeeController {

	@GetMapping("/work")
	public String doAdminWork()
	{
		return "Employee - task";
	}
}
	

