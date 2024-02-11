package com.cjc.app.daoimpl;



import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.app.dao.HomeDao;
import com.cjc.app.model.Employee;

@Repository
public class HomeDaoImpl implements HomeDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public void savedata(Employee e) {
		
	
		Session session = sf.openSession();
		session.save(e);
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		
	}

	@Override
	public List<Employee> getalldata() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		return list;
	}

	@Override
	public List<Employee> getparticular(String a, String b) {
		Session session = sf.openSession();
		Query query = session.createQuery("from Employee where uname=:x and pass=:y");
		query.setParameter("x", a);
		query.setParameter("y", b);
		List<Employee> list = query.getResultList();
		return list;
	
	}

	@Override
	public Employee getidrelateddata(int a) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Employee where eid =:x");
		query.setParameter("x", a);
		Employee e = (Employee) query.getSingleResult();
	
		tx.commit();
		return e;
	}

	@Override
	public void updatedata(Employee e) {
	       Session session = sf.openSession();
	       session.save(e);
	       Transaction tx = session.beginTransaction();
	       tx.commit();
		
	}

	@Override
	public void deletedata(int a) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Employee where eid=:a");
		query.setParameter("a", a);
		query.executeUpdate();
		tx.commit();
		
		
	}

}
