package p1;

/* class responsible to create UI Layer*/
public class UILayer {
	
	StudentBusinessOperation businessOperations;
	
	public UILayer() {
		businessOperations = new StudentBusinessOperation();
	}
	
	public static void main(String[] args) {
		
		UILayer app = new UILayer();
		
		Student s1 = new Student(101, "Mike", 88, "Java");
		
		String status = app.createStudent(s1);
		System.out.println(status);
		
		// two calls of random value 
		app.displayRandomStudent(0);
		
		app.displayRandomStudent(45);
	}
	
	
	public void displayRandomStudent(int indexValue)
	{
		System.out.println(businessOperations.getStudentFromDatabase(indexValue).getEnrollmentNumber());
	}
	
	public String createStudent(Student student)
	{
		// code to send student in data .. through server
		
		
		return businessOperations.storeStudent(student);
	}

}
