package patternpractice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


@NamedQueries(
		{
			@NamedQuery(name = "getdata", query = "from Cust" ),
			@NamedQuery(name = "deletedata" , query = "delete from Cust where cid = ?"),
			@NamedQuery(name = "updatedata" , query = "update Cust set cname =?, caddr =? where cid =?"),
			
			
		})
@NamedNativeQueries({
	@NamedNativeQuery(name ="getthedata", query ="select * from Cust",resultClass = Cust.class)
	
})
@Entity
public class Cust {


	
	@Id
	
	private int cid;
	private String cname;
	private String caddr;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
}
