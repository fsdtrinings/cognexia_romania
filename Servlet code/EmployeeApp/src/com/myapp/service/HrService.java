package com.myapp.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myapp.dao.DAOImpl;
import com.myapp.entity.Users;

public class HrService {
	
	DAOImpl dao = new DAOImpl();
	
	public List<Users> getAllUsers()throws Exception
	{
		ResultSet rs = dao.getAllUsers();
		List<Users> list = new ArrayList<>();
		
		while(rs.next())
		{
			Users user = new Users();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("Password"));
			user.setRole(rs.getString("Role"));
			
			
			list.add(user);
		}
		return list;
	}

}
