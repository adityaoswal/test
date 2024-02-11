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

import com.example.demo.model.Employee;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {

	
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/insertdata")
	public Employee postdata(@RequestBody Employee e)
	{
		
		
		return hs.postdata(e);
	}
	
	@GetMapping("/getdata")
	public List<Employee> getdata()
	{
		
		return hs.getdata();
	}
	
	@PutMapping("/updatedata/{eid}")
	public Employee updatedata(@PathVariable("eid") int a,@RequestBody Employee e)
	{
		
		e.setEid(a);
		
		return hs.updatedata(e);
		
		
	}
	
	@DeleteMapping("/deletedata/{eid}")
	public String deleted(@PathVariable("eid") int a)
	{
		
		hs.deletedata(a);
		
		return "data deleted successfully";
	}
}
