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
	
	
	
	@RequestMapping("/newuser")
	public String adduser()
	{
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String log(@RequestParam("uname") String a,@RequestParam("pass") String b,Model m)
	{
		if(a.equals("admin") && b.equals("admin"))
		{
			
			List l = hs.getdata();
			
			m.addAttribute("data",l);
			
			return "success";
			
		}
		
		else
		
		{
		return "login";
		}
	}
	
	@RequestMapping("/details")
	public String register(@ModelAttribute Employee e)
	{
		
		
		hs.save(e);
		
		return "index";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("eid") int a,Model m)
	{
		
		hs.delete(a);
		
		List l = hs.getdata();
		
		m.addAttribute("data", l);
		
		return "success";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("eid") int a,Model m)
	{
		
		
		
		Employee e = hs.edit(a);
		
		m.addAttribute("data", e);
		
		return "edit";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Employee e,Model m)
	{
		
		hs.update(e);
		
		List l = hs.getdata();
		
		m.addAttribute("data", l);
		
		return "success";
	}
	
	
}
