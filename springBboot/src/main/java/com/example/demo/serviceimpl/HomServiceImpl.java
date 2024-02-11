package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomServiceImpl implements HomeService{

	
	@Autowired
	HomeRepository hr;

	@Override
	public Employee postdata(Employee e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}

	@Override
	public List<Employee> getdata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Employee updatedata(Employee e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}

	@Override
	public void deletedata(int a) {
		// TODO Auto-generated method stub
		hr.deleteById(a);
		
		
		
	}
}
