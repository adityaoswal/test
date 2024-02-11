package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Employee;

public interface HomeService {

public	void savedata(Employee e);

public List<Employee> getalldata();

public List<Employee> getparticular(String a, String b);

public Employee getidrelateddata(int a);

public void updatedata(Employee e);

public void deletedata(int a);

}
