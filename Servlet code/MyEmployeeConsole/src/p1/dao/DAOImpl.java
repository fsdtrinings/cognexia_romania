package p1.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import p1.entity.MyUser;

public class DAOImpl {
	
	List<MyUser> list = new ArrayList<MyUser>();
		
	public DAOImpl() {
		
		char ch = 'a';
		
		MyUser user1 = new MyUser(ch+"", "a", "HR");
		MyUser user2 = new MyUser((++ch)+"", "a", "HR");
		MyUser user3 = new MyUser((++ch)+"", "a", "Developer");
		MyUser user4 = new MyUser((++ch)+"", "a", "Developer","CityBankApp");
		MyUser user5 = new MyUser((++ch)+"", "a", "Developer","NewAirways",Arrays.asList("Task1","Task2"));
		MyUser user6 = new MyUser((++ch)+"", "a", "Developer");
		MyUser user7 = new MyUser((++ch)+"", "a", "Developer","BigAirlines");
		MyUser user8 = new MyUser((++ch)+"", "a", "Developer","Smart-Insurance-App");
		
		
		list = Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8);
		
		
	}
	
	public MyUser validateUser(String username,String password)
	{
		Optional<MyUser> myOpuser = list.stream().filter((user)->{
			return user.getUsername().equals(username) & user.getPassword().equals(password)? true: false;
		}).findFirst();
		
		if(myOpuser != null) return  myOpuser.get();
		else return null;
	}
	
	public void allocateProject(String username,String projectName)
	{
		Optional<MyUser> myuser = list.stream().filter((user)->{
			return user.getUsername().equals(username)? true: false;
		}).map((user)->{
			 user.setProjectName(projectName);
			 return user;
		}).findFirst();
	}

}
