package com.config;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.entity.Person;

public class hibernateutil {

	private static SessionFactory sf = null;
    private static StandardServiceRegistry registry; 	
	public static SessionFactory getsessionfactory() {
		
		
		if(sf==null)
		{
			try {
				
				Map<String, String> maps = new HashMap<>();
				
				maps.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				maps.put(Environment.URL, "jdbc:mysql://localhost:3306/gear5hibernatecrud");
				maps.put(Environment.USER, "root");
				maps.put(Environment.PASS, "root");
				maps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				maps.put(Environment.HBM2DDL_AUTO, "update");
				maps.put(Environment.SHOW_SQL, "true");
				
				registry = new StandardServiceRegistryBuilder().applySettings(maps).build();
				
				
				MetadataSources mds = new MetadataSources(registry);
				
				mds.addAnnotatedClass(Person.class);
				
				 
				Metadata md =mds.getMetadataBuilder().build();
				
				  sf=md.getSessionFactoryBuilder().build();
				
				
				
			}catch (Exception e) {
				System.out.println("sessionfactory creation fails ");
			}
			
			
		}
		return sf;
		
		
	}	
}
