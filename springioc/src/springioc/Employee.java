package springioc;

public class Employee {

	
private int eid;
private String ename;
private Address adr;


public Employee(int eid, String ename, Address adr) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.adr = adr;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", adr=" + adr + "]";
}


	

	
	
	
	
}
