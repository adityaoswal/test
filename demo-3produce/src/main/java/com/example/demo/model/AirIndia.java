package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AirIndia {

	@Id
	private int aid;
	private String fromloc;
	private String toloc;
	
	
}
