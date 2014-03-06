package com.hkg.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetRowTest {

	public static void main(String[] args) {
		Connection con= null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found.");
			e.printStackTrace();
		}
	    
		try {
			con = DriverManager.getConnection
			  ("jdbc:mysql://localhost/EMP","root","root");
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			e.printStackTrace();
		}
	    
		try {
			stmt = con.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			System.out.println("Statement creeation failed.");
			e.printStackTrace();
		}
	      String query = "select * from  Employees";
	      try {
	    	  ResultSet rs = stmt.executeQuery(query);
	    	  rs.last();
		      System.out.println("No of rows in table="+rs.getRow());
		      rs.moveToInsertRow();
		      rs.updateInt("id", 6);
		      rs.updateInt("age", 26);
		      rs.updateString("first","sujay");
		      rs.updateString("last", "padhiyar");
		      rs.insertRow();
		      System.out.println("Row added");
		} catch (SQLException e) {
			System.out.println("Execution failed.");
			e.printStackTrace();
		}
	      System.out.println("inserted.");
	}

}
