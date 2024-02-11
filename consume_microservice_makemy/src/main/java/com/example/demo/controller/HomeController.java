package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@RestController
public class HomeController {

	
	@Autowired
	RestTemplate rt;
	
	@PostMapping("/postdata")
	public Employee saved(@RequestBody Employee e)
	{
		
		String url = "http://zuul/regpro/postdata";
		
		Employee e1 = rt.postForObject(url, e, Employee.class);
		
		return e1;
	}
	
}
