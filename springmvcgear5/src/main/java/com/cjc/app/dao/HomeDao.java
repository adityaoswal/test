package com.cjc.app.dao;

import java.util.List;

import com.cjc.app.model.Employee;

public interface HomeDao {

public	List getdata();

public void save(Employee e);

public void delete(int a);

public Employee edit(int a);

public void update(Employee e);

}
