package com.abc.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicRestControllers {

	@GetMapping("/welcome")
	public String doHomeThings()
	{
		return "Welcome Home Page";
	}
	
}
