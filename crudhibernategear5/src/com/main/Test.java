package com.main;



import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.hibernateutil;
import com.entity.Person;


public class Test {

	
	public static void main(String[] args) {
		
		
	Session session = hibernateutil.getsessionfactory().openSession();
	
	Transaction tx = session.beginTransaction();
	
	CriteriaBuilder cb = session.getCriteriaBuilder();
	
    CriteriaUpdate<Person> cu = cb.createCriteriaUpdate(Person.class);
    
    Root<Person> rt = cu.from(Person.class);
    
    cu.set(rt.get("pname"), "adiii");
    
    cu.where(cb.equal(rt.get("pid"), 101));
    
    Query<Person> query = session.createQuery(cu);
    
	query.executeUpdate();
	
	
	

		
		
		
		
		
		
		
		
		
	}
	
}
