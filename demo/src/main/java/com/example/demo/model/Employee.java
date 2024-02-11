package com.example.demo.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Employee {

	
	private int eid;
	private String ename;
	private String address;
	private long salary;
	
}
