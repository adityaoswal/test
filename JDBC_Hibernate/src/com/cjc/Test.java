package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

public class Test {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gomugomu", "root", "root");
		
		String sql = "insert into employee values (?,?,?)";
		
	  PreparedStatement ps = con.prepareStatement(sql);
	  
	  ps.setInt(1, 4);
	  ps.setString(2, "kamptee");
	  ps.setString(3, "sandeep");
	  
	  ps.execute();
	  
	    
		 
		 System.out.println("added");
		 
		 
	
		
		
		
	}
	
}
