package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAOImpl {
	
	Connection con;
	
	public DAOImpl() {
		con = DatabaseConnection.con;
		System.out.println(con);
	}
	
	
	public boolean validateUser(String username,String password)throws SQLException
	{
		String query = "select * from appusers where username = ? and password = ?";
		boolean isValidUser = false;
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		
		
		 ResultSet rs  = ps.executeQuery();
		 
		 while(rs.next())
		 {
			 return true;
		 }
		
		return isValidUser;
	}

	public boolean insertUser(String username,String password , String role)throws SQLException
	{
		boolean isInserted = false;
		
		String query = "insert into appusers values(?,?,?);";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,role);
		
		
		int rowsEffected = ps.executeUpdate(); // use to call DML Queries 
		
		isInserted = (rowsEffected>0)?true:false;
		
		return isInserted;
		
		
	}
	
	   // List<User>
	public ResultSet getAllUsers()throws SQLException
	{
		String query = "select * from appusers";
		PreparedStatement ps = con.prepareStatement(query);
		
		
		
		 ResultSet rs  = ps.executeQuery();
		 return rs;
		
	}
}
