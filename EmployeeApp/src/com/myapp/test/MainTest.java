package com.myapp.test;

import com.myapp.dao.DAOImpl;

public class MainTest {
	
	public static void main(String[] args) throws Exception{
		
	
		
		DAOImpl obj = new DAOImpl();
		/*boolean b = obj.validateUser("mike", "mike");
		System.out.println(b);
		
		b = obj.validateUser("mike", "mike133");
		System.out.println(b);
		
		b = obj.validateUser("jenny", "jenny");
		System.out.println(b);*/
		
		boolean x  = obj.insertUser("test","test", "employee");
		System.out.println(x);
		
		
	}
	

}
