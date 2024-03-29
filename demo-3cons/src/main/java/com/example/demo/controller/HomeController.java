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

import com.example.demo.model.AirIndia;

@RestController
public class HomeController {

	
	@Autowired
	RestTemplate rt;
	
	
	@PostMapping("/sav")
	public AirIndia saved(@RequestBody AirIndia a)
	{
		
		String url = "http://localhost:9090/savedata";
		
		AirIndia b = rt.postForObject(url,a,AirIndia.class);
		
		return b;
		
	}
	
	@GetMapping("/get")
	public List getd()
	{
		
		String url = "http://localhost:9090/getdata";
		
		List l = rt.getForObject(url, List.class);
		
		return l;
		
	}
	
	
	@PutMapping("/put/{aid}")
	public void putdata(@PathVariable("aid") Integer a,@RequestBody AirIndia b)
	{
	
		String url = "http://localhost:9090/updatedata/"+a;
	     
		  rt.put(url, b, AirIndia.class);
		
		
		
		
	}
	
	@DeleteMapping("/del/{aid}")
	public String deld(@PathVariable("aid") Integer a)
	{
		
		String url = "http://localhost:9090/deletedata/"+a;
		
		rt.delete(url);
		
		return "data deleted";
	}
}
