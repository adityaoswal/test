package springiocgear5;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int sid;
	private String sname;
	@Autowired
	private Address adr;
     
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", adr=" + adr + "]";
	}


	
	
	
	
	
	
}
