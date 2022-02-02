package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class controller {

	
	@GetMapping("/Auth")
	public String message()
	{
		
		return "Authentication sucess";
	}
	
	@GetMapping("/NoAuth")
	public String message1()
	{
		
		return "No Auth";
	}
}
