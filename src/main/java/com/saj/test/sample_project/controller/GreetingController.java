package com.saj.test.sample_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sajjad Khan
 *
 */
@RestController
public class GreetingController {
	
	@RequestMapping("/")
	public String greeting(){
		return "<h1>I love you Mehnaz</h>";
	}

}
