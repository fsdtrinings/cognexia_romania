package p1;

import java.util.Iterator;

/* class responsible for business calculation / processing / use case*/
public class StudentBusinessOperation {
	
	DatabaseUtil dbObj = new DatabaseUtil();
	
	public boolean validateStudent(Student student)
	{
		// code to validate student value
		
		if(student.getScreeningScore()>80 && student.getCourseName().equals("Java"))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	}
	
	public String storeStudent(Student student)
	{
		String userMsg = "";
		
		// 1. validate Student 
		 // 1.a if validate true then store student database.
		 //1.b else return error msg to user
		if(validateStudent(student))
		{
			// send student towards database layer to store data
			dbObj.storeStudent(student);
			return "Student Add in the Database";
			
		}else
		{
			// return error msg to user
			return "Java cannot be allocated to the student , where screening score is less than 80";
		}

		
	}
	
	
	public Student getStudentFromDatabase(int indexNumber)
	{
		Student student = dbObj.getStudentBasedOnIndexValue(indexNumber);
		
		return student;
	}
	
	
	
	public Student[] getStudentByCourse(String courseName)
	{
		
		Student allStudents[] = dbObj.getArr();
		int count = dbObj.getCount();
		
		Student temporaryArr[] = new Student[1000];
		int index = 0;
		
		for(int i = 0;i<allStudents.length;i++)
		{
			Student s = allStudents[i];
			
			if(s.getCourseName().equalsIgnoreCase(courseName))
			{
				temporaryArr[index++] = s;
			}
		}
		
		
		return temporaryArr;
	}

}
