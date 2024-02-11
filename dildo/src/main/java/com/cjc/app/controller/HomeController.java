package com.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Employee;
import com.cjc.app.service.HomeService;

@Controller
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/newreg")
	public String transfertoregisterpage()
	{
		
		
		return "register";
	}
	
	
	@RequestMapping("/details")
	public String savethedetails(@ModelAttribute Employee e)
	{
		
		hs.save(e);
		
		return "index";
	}
	
	@RequestMapping("/log")
	public String checklogin(@RequestParam("uname") String a,@RequestParam("pass") String b,Model m)
	{
		
		List l =   hs.getalldata();

		
		
		if(a.equals("admin") && b.equals("admin"))
		{
			
						
			m.addAttribute("data", l);
			return "success";
		}
		
		else
		{
			return "index";
		}
	}
	
	
	
	
}
