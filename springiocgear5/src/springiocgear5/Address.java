package springiocgear5;

public class Address {

	private String areaname;
	private String pincode;
	
	public Address(String areaname, String pincode) {
		super();
		this.areaname = areaname;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
