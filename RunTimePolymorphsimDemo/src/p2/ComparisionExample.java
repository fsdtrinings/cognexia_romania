package p2;

import p1.Employee;

public class ComparisionExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Mike", 2000);
		Employee e2 = new Employee(102, "Alex", 2000);
		Employee e3 = new Employee(101, "Mike", 2000);
		Employee e4 = e1;
		
		boolean isSame = (e1 == e4);
		
		System.out.println(isSame);
		
		
		// -----------------------------------
		
		boolean isEqual = (e1.equals(e3));
		System.out.println(isEqual);
		
	}
}
