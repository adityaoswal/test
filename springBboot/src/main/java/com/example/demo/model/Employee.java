package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	
	@Id
	private int eid;
	private String ename;
	private String address;
	
	
	
}
