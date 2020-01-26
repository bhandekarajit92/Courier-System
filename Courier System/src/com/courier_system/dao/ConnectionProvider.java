package com.courier_system.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection con=null;
	static {
		try {
			Class.forName("com.sql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courierdb","root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	} 
	

}
