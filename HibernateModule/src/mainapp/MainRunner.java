package mainapp;

import org.hibernate.Session;

import p1.Employee;

public class MainRunner {

	public static void main(String[] args) {
		
		Session hibernate = SessionFactoryUtil.getFactory().openSession(); // we initialize the hibernate
		
		hibernate.beginTransaction();
		
		
		Employee e = new Employee(101, "Mike", "mike@gmail.com",2000);
		hibernate.save(e);
		
		hibernate.getTransaction().commit();
		hibernate.close();
		
		
	}
}
