package mainapp;

import org.hibernate.Session;

import p1.Address;
import p1.Employee;

public class MainRunner_Embedded {

	public static void main(String[] args) {
		
		Session hibernate = SessionFactoryUtil.getFactory().openSession(); // we initialize the hibernate
		
		doSaveEntity(hibernate);  
		
		//doGetEntity(hibernate);
		
		hibernate.close();
		
		
	}
	
	public static void doGetEntity(Session hibernate)
	{
		
		
	}
	
	
	
	public static void doSaveEntity(Session hibernate)
	{
		hibernate.beginTransaction();
		
		
		Employee e = new Employee(107, "a7", "a7@gmail.com",2000);
		e.setAge(30);
		
		Address empAddress = new Address("Abc-123","New Delhi", "India");
		e.setPeraddress(empAddress);
		
		Address empAddress2 = new Address("xyz-123","London", "UK");
		e.setTemporaryAddress(empAddress2);
		
		
		
		
		hibernate.save(e);
		
		hibernate.getTransaction().commit();
	}
}












