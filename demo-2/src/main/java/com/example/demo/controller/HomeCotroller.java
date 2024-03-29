package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Passenger;


@RestController
public class HomeCotroller {
	
	@Autowired 
	RestTemplate rt;
	
	
	@PostMapping("/postd")
	public Passenger post(@RequestBody Passenger p)
	{
		
		String url = "http://localhost:9090/postdata";
		Passenger ps = rt.postForObject(url, p, Passenger.class);
		return ps;
	}
	
	@GetMapping("/getd")
	public List<Passenger> get()
	{
		
		String url ="http://localhost:9090/getdata";
		List<Passenger> list = rt.getForObject(url, List.class);
		return list;
	}
	
	@DeleteMapping("/deld/{pid}")
	public String deld(@PathVariable("pid") int a)
	{
		
		String url = "http://localhost:9090/deletedata/"+a;
		rt.delete(url);
		return "data deleted successfully";
	}

}
