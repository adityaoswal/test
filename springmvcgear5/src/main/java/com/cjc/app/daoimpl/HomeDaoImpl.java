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
	public List getdata() {
		Session session = sf.openSession();
	
		Query query = session.createQuery("from Employee");
		List l = query.getResultList();
		return l;
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		
	}

	@Override
	public void delete(int a) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Employee where eid=:x");
		query.setParameter("x", a);
		query.executeUpdate();
		tx.commit();
	}

	@Override
	public Employee edit(int a) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query query = session.createQuery("from Employee where eid=:x");
		query.setParameter("x", a);
		Employee e = (Employee) query.getSingleResult();
		return e;
	}

	@Override
	public void update(Employee e) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(e);
		tx.commit();

	}}
