package com.jwt_authentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		String str = " This is the private page ";
		str += " This page is not allowed for unautherized users";
		return str;
	}

}
