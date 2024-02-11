package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface HomeService {

public	Employee postdata(Employee e);

public List<Employee> getdata();

public Employee updatedata(Employee e);

public void deletedata(int a);

}
