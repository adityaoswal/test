package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.HomeService;




@CrossOrigin("*")
@RestController
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	@PostMapping("/add")
	public Employee save(@RequestBody Employee e)
	{
		
		return hs.savedata(e);
	}
	
	@GetMapping("/getdata")
	public List<Employee> getdata()
	{
		
		return hs.getdata();
	}
	
	
	@DeleteMapping("/del/{eid}")
	public String delete(@PathVariable("eid") int a)
	{
		 hs.deletedata(a);
		 
		 return "data deleted";
	}
	
	
	@PutMapping("/update/{eid}")
	public Employee update(@PathVariable("eid") int a,@RequestBody Employee e)
	{
		e.setEid(a);
		 return hs.update(e);
	}
}
