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
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@RestController
public class HomeController {

	
	@Autowired
	RestTemplate rt;
	
	
	
	@PostMapping("/postdata")
	public Employee post(@RequestBody Employee e)
	{
		
	    String url = "http://localhost:9090/savedata";
	    
	    Employee e1 = rt.postForObject(url, e, Employee.class);
	    
	    return e1;
	    
	    
		
	}
	
	@GetMapping("/getalldata")
	public List<Employee> get()
	{
		
		String url = "http://localhost:9090/getdata";
		
		List<Employee> l = rt.getForObject(url, List.class);
		
		return l;
	}
	
	@PutMapping("/updat/{eid}")
	public Employee update(@PathVariable("eid") int a, @RequestBody Employee e)
	{
		
		e.setEid(a);
		
		String url = "http://localhost:9090/updatedata/"+a;
		
		 rt.put(url, e);
		
		return e;
	}
	
	
	@DeleteMapping("/delt/{eid}")
	public String delt(@PathVariable("eid") int a)
	{
		String url = "http://localhost:9090/delete/"+a;
		
		rt.delete(url);
		
		return "data deleted succcessfully";
		
	}
}
