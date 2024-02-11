package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface HomeService {

public	Employee savedata(Employee e);

public List<Employee> getdata();

public void deletedata(int a);

public Employee update(Employee e);

	

}
