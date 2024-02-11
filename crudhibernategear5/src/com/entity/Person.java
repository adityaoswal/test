package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;


@Entity
public class Person {

	@Id
	
	private Integer pid;
	private String pname;
	private String paddr;
	private long padhar;
	private long pmobno;
		public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public long getPadhar() {
		return padhar;
	}
	public void setPadhar(long padhar) {
		this.padhar = padhar;
	}
	public long getPmobno() {
		return pmobno;
	}
	public void setPmobno(long pmobno) {
		this.pmobno = pmobno;
	}
		
}
