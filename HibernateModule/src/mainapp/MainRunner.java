package mainapp;

import org.hibernate.Session;

import p1.Employee;

public class MainRunner {

	public static void main(String[] args) {
		
		Session hibernate = SessionFactoryUtil.getFactory().openSession(); // we initialize the hibernate
		
		//doSaveEntity(hibernate);  // call insert query 
		
		doGetEntity(hibernate);
		
		hibernate.close();
		
		
	}
	
	public static void doGetEntity(Session hibernate)
	{
		//Employee e = (Employee)hibernate.get(Employee.class, 103);     // from Hibernate 
		Employee e = (Employee)hibernate.load(Employee.class, 103);  // from JPA 
		
		System.out.println(" statement 1 ");
		
		System.out.println(" Employee is :- "+e);
		
		//hibernate.delete(e);
		 doSomeUpdates(hibernate, e);
		
		 System.out.println(" Employee is :- "+e);
		
	}
	
	public static void doSomeUpdates(Session hibernate , Employee e)
	{
		doUpdateAge(e,hibernate,70);
		hibernate.evict(e);
		doUpdateAge(e,hibernate,17); 
		
		// 1000 line code 
		hibernate.merge(e);
	}
	
	public static void doUpdateAge(Employee e,Session hibernate,int age)
	{
		hibernate.beginTransaction();
		e.setAge(age);
		
		hibernate.getTransaction().commit();
	}
	
	
	public static void doSaveEntity(Session hibernate)
	{
		hibernate.beginTransaction();
		
		
		Employee e = new Employee(105, "a5", "a5@gmail.com",2000);
		e.setAge(30);
		hibernate.save(e);
		
		hibernate.getTransaction().commit();
	}
}
