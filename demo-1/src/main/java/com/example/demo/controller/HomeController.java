package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {


	@Autowired
	HomeService hs;
	
	@PostMapping("/postdata")
	public Passenger post(@RequestBody Passenger p)
	{
		
		return hs.savedata(p);
	}
	
	@GetMapping("/getdata")
	public List<Passenger> get()
	{
		
		return hs.getdata();
		
	}
	
	
	@DeleteMapping("/deletedata/{pid}")
	public String delete(@PathVariable("pid") int a)
	{
		
		
				hs.deletedata(a);
				
				return "data deleted successfully";
	}
}
