package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Passenger;

public interface HomeService {

public	Passenger savedata(Passenger p);

public List<Passenger> getdata();

public void deletedata(int a);

}
