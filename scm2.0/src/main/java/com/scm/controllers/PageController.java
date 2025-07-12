package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/home")
	public String homePage() {
		System.out.println("This is the home page");
		
		return "home";
	}

}
