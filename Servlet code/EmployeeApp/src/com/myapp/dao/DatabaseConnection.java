package com.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public static Connection con = null;
	
	

     static{
    	 
    	 	String host = "localhost:3306";
    	    String database = "ncsboot";
    	    String url = "jdbc:mysql://"+ host+"/"+database;
    	   
    
    	 try{
    	

    	    	Class.forName("com.mysql.cj.jdbc.Driver");
    	        con = DriverManager.getConnection(url,"root","admin");
    	        System.out.println("con "+con);
    	 }
    	 catch (Exception e) {
    		 System.out.println(e);
		}
    	
	}
    
    
}
