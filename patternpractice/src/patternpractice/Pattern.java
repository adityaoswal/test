package patternpractice;






import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class Pattern {

	public static void main(String[] args)  {

   SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
   
   Session session = sf.openSession();
   
   Transaction tx = session.beginTransaction();
   
   Query<Cust> query = session.getNamedNativeQuery("getthedata");
  
   List<Cust> list = query.getResultList();
   
   for(Cust c : list)
   {
	   System.out.println(c.getCaddr());
   }
   
   tx.commit();
	
	
		
		
		
		
		
		
	}
	
	
}