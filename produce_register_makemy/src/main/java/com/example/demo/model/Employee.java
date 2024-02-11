package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	private int eid;
	private String ename;
	private String emob;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmob() {
		return emob;
	}
	public void setEmob(String emob) {
		this.emob = emob;
	}
}
