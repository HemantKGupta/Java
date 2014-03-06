package com.hkg.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetColumnTest {

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
		      ResultSetMetaData rsmd = rs.getMetaData();
		      System.out.println("no of columns in the table= "+rsmd.getColumnCount());
		      System.out.println("Name of the first column "+rsmd.getColumnName(1));
		      System.out.println("Type of the second column "+rsmd.getColumnTypeName(2));
		} catch (SQLException e) {
			System.out.println("Execution failed.");
			e.printStackTrace();
		}
	      System.out.println("inserted.");

	}

}
