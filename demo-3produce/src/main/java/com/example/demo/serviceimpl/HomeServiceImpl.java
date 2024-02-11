package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AirIndia;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService {

	
	@Autowired
	HomeRepository hr;
	
	@Override
	public AirIndia saved(AirIndia a) {
		// TODO Auto-generated method stub
		return hr.save(a);
	}

	@Override
	public List getd() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public AirIndia updated(AirIndia b) {
		// TODO Auto-generated method stub
		return hr.save(b);
	}

	@Override
	public void deleted(Integer a) {
		// TODO Auto-generated method stub
		hr.deleteById(a);
	}

}
