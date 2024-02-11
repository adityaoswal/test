package com.cjc.app.doaimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		
		tx.commit();
		
	}

	@Override
	public List getdata() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String hql = "from Employee";
		
		Query<Employee> query = session.createQuery(hql);
		
		List l = query.getResultList();
		
		return l;
	}

}
