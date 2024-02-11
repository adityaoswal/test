package com.cjc.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Employee;
import com.cjc.app.service.HomeService;




@Controller
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	
	
	
	@RequestMapping("/newuser")
	public String m2()
	{
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String m3(@RequestParam("uname") String a,@RequestParam("pass") String b,Model m,@ModelAttribute Employee e)
	{
		
		List<Employee> list = hs.getalldata();
		
		if(a.equals("admin") && b.equals("admin"))
		{
			m.addAttribute("data",list);
			return "success";
		}
		
		if(a.equals(e.getUname()) && b.equals(e.getPass()))
		{
			
			List<Employee> l = hs.getparticular(a,b);
			
			m.addAttribute("data", l);
			
			return "success";
			
			
		}
		
		return  "index";
		
	}
	
	
	@RequestMapping("/details")
	public String m1(@ModelAttribute Employee e)
	{
		
		hs.savedata(e);
		
		return "index";
	}
	
	
	@RequestMapping("/edit/{eid}")
	public String m4(@PathVariable("eid") int a,Model m)
	{
		Employee e = hs.getidrelateddata(a);
		
		m.addAttribute("data",e);
		return "ed";
		
		
	}
	
	
	@RequestMapping("/update")
	public String m5(@ModelAttribute Employee e, Model m)
	{
		hs.updatedata(e);
		
		List<Employee> list = hs.getalldata();
		
		m.addAttribute("data", list);
		
		return "success";
		
		
	}
	
	@RequestMapping("/delete/{eid}")
	public String m6(@PathVariable("eid") int a, Model m)
	{
		
		hs.deletedata(a);
		List<Employee> list = hs.getalldata();
		m.addAttribute("data", list);
		return "success";
	}
	
}
