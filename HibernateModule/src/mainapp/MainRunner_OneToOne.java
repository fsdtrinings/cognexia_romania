package mainapp;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import p1.Address;
import p1.Employee;
import p1.EmployeeDependent;
import p1.WorkStation;

public class MainRunner_OneToOne {

	public static void main(String[] args) {
		
		Session hibernate = SessionFactoryUtil.getFactory().openSession(); // we initialize the hibernate
		
		doSaveEntity(hibernate);  
		
		
		
		hibernate.close();
		
		
	}
	
	
	
	public static void doSaveEntity(Session hibernate)
	{
		hibernate.beginTransaction();
		
		
		Employee e = new Employee(102, "a2", "a2@gmail.com",12000);
		e.setAge(30);
		
		//------------------------------------------------------------------------------------------
		Address empAddress = new Address("Abc-123","Mumbai", "India");
		e.setPeraddress(empAddress);
		
		Address empAddress2 = new Address("xyz-123","NewYork", "USA");
		e.setTemporaryAddress(empAddress2);
		
		
		EmployeeDependent dep1 = new EmployeeDependent("a",25, "Male", "Brother");
		EmployeeDependent dep2 = new EmployeeDependent("b",65, "Female", "Mother");
		EmployeeDependent dep3 = new EmployeeDependent("b",25, "Female", "Wife");
		

		List<EmployeeDependent> dependentList = Arrays.asList(dep1,dep2,dep3);
		e.setAllDependents(dependentList);
		
		//------------------------------------------------------------------------------------------
		             /*   One to One */
		
		WorkStation workStation = new WorkStation(700, 500, 741258963L);
		e.setWorkStation(workStation);
		// ------------------------------------------------------------------------------------------
		
		hibernate.save(e);
		
		hibernate.getTransaction().commit();
	}
}












