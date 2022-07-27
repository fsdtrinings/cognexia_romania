package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"A",2000);
		Employee e2 = new Employee(102,"A",2000);
		Employee e3 = new Employee(103,"A",2000);
		
		List<Employee> allEmployees = new ArrayList<>();
		
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		
		new Demo2().printCollection(allEmployees);
	}
	
	public void printCollection(Collection<Employee> collection)
	{
		for (Employee employee : collection) {
			System.out.println(employee);
		}
	}

}


/*     Layered Arch
 * 1. filter employees based n salary
 * 2. filter employees based on Project 
 * 3. update the employee salary based on Id and based Project
 * 4. create employees
 * 5. allocate project to employees
 * 
 * 
 * */
