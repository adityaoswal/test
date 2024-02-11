package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passenger;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Passenger savedata(Passenger p) {
		// TODO Auto-generated method stub
		return hr.save(p);
	}

	@Override
	public List<Passenger> getdata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deletedata(int a) {
		// TODO Auto-generated method stub
		 hr.deleteById(a);
	}

}
