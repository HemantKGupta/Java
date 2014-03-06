package com.hkg.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

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
			stmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("Statement creeation failed.");
			e.printStackTrace();
		}
	      String query = "insert into Employees values (5, 24, 'ronak','arjaria')";
	      try {
			stmt.execute(query);
		} catch (SQLException e) {
			System.out.println("Execution failed.");
			e.printStackTrace();
		}
	      System.out.println("inserted.");
	     

	}

}
