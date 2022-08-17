package com.abc.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class MyRestController {

	@GetMapping("/work")
	public String doAdminWork()
	{
		return "Admin - task";
	}
}


//  localhost :8082/api/welcome

