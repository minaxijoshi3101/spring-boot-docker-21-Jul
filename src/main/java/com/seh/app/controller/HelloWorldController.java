package com.seh.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/message")
	public String hello()
	{
		return "Welcome to SEH!!";
	}

}
