package com.cjc.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.dao.HomeDao;
import com.cjc.app.model.Employee;
import com.cjc.app.service.HomeService;

@Service
public class HomeServiceImpl  implements HomeService{

	@Autowired
	HomeDao hd;
	
	@Override
	public void savedata(Employee e) {
		
		hd.savedata(e);
		
	}

	@Override
	public List<Employee> getalldata() {
		// TODO Auto-generated method stub
		return hd.getalldata();
	}

	@Override
	public List<Employee> getparticular(String a, String b) {
		// TODO Auto-generated method stub
		return hd.getparticular(a,b);
	}

	@Override
	public Employee getidrelateddata(int a) {
		// TODO Auto-generated method stub
		return hd.getidrelateddata(a);
	}

	@Override
	public void updatedata(Employee e) {
		hd.updatedata(e);
		
	}

	@Override
	public void deletedata(int a) {
		hd.deletedata(a);
		
	}

}
