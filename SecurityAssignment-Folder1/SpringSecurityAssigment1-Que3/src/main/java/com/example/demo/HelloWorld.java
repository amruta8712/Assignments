package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping(value="/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value="/user")
	public String welcomeUser() {
		return "Welcome User";
	}
	
	@RequestMapping(value="/admin")
	public String welcomeAdmin() {
		return "Welcome Admin";
	}

}
