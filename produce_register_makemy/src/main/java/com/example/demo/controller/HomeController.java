package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {

	
	
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/postdata")
	public Employee saveda(@RequestBody Employee e)
	{
		
		 return hs.save(e);
	}
	
	
	
}
