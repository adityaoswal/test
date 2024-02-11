package com.cjc.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.dao.HomeDao;
import com.cjc.app.model.Employee;
import com.cjc.app.service.HomeService;

@Service
public class HomeserviceImpl implements HomeService{

	@Autowired
	HomeDao hd;
	
	@Override
	public List getdata() {
		// TODO Auto-generated method stub
		return hd.getdata();
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		hd.save(e);
	}

	@Override
	public void delete(int a) {
		// TODO Auto-generated method stub
		hd.delete(a);
	}

	@Override
	public Employee edit(int a) {
		// TODO Auto-generated method stub
		return hd.edit(a);
	}

	@Override
	public void update(Employee e) {
		// TODO Auto-generated method stub
		hd.update(e);
	}

}
