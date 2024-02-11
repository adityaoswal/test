package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Employee;

public interface HomeService {

public	List getdata();

public void save(Employee e);

public void delete(int a);

public Employee edit(int a);

public void update(Employee e);

}
