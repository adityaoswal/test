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
public class HomeDaoImpl implements HomeDao{

	@Autowired
	SessionFactory sf;
	
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		
		tx.commit();
		
	}

	@Override
	public List getalldata() {
		// TODO Auto-generated method 

		Session session = sf.openSession();
				Query querry = session.createQuery("from Employee");
		
		List l=  querry.getResultList();
		
		return l;
	}

	
	
}
