package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class HomeController {

	
	@Value("${api.key}")
	private String key;
	
	@Autowired
	RestTemplate rt;
	
	
	
	
}
