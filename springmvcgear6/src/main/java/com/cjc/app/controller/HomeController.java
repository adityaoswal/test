

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
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index";
		
		
	}
	
	@RequestMapping("/newuser")
	public String adduser()
	{
		
		return "register";
	}
	
	
	@RequestMapping("/details")
	public String filldetails(@ModelAttribute Employee e)
	{
		
		hs.savedata(e);
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String getlogged(@RequestParam("uname") String a,@RequestParam("pass") String b,Model m)
	{
		
		if(a.equals("admin") && b.equals("admin"))
		{
			
			List l = hs.getdata();
			
			m.addAttribute("data", l);
			
			return "success";
		}
		else {
			return "index";
		}
		
		
		
	}
	
	
	@RequestMapping("/delete/{eid}")
	public String deletedata(@PathVariable("eid") int a, Model m)
	{
		
		hs.delete(a);
		
		List l = hs.getdata();
		
		m.addAttribute("data", l);
		
		return "success";
	}
	
	@RequestMapping("/edit/{eid}")
	public String editdata(@PathVariable("eid") int a,@ModelAttribute Employee e)
	{
		
		
	}
}
