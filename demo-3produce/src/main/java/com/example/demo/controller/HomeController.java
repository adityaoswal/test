package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AirIndia;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	@PostMapping("/savedata")
	public AirIndia saved(@RequestBody AirIndia a)
	{
		
		return hs.saved(a);
		
	}
	
	@GetMapping("/getdata")
	public List getd()
	{
		
		return hs.getd();
	}
	
	@PutMapping("/updatedata/{aid}")
	public AirIndia updatedata(@PathVariable("aid") Integer a,@RequestBody AirIndia b)
	{
		b.setAid(a);
		
		return hs.updated(b);
		
		
	}
	
	@DeleteMapping("/deletedata/{aid}")
	public String deletedata(@PathVariable("aid") Integer a)
	{
		
		hs.deleted(a);
		
		return "Id has been deleted";
	}
	
	
}
