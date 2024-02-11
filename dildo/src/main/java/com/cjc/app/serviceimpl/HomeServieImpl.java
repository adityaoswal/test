package com.cjc.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.dao.HomeDao;
import com.cjc.app.model.Employee;
import com.cjc.app.service.HomeService;

@Service
public class HomeServieImpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		hd.save(e);
	}

	@Override
	public List getalldata() {
		// TODO Auto-generated method stub
		return hd.getalldata();
	}

}
