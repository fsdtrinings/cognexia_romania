package p1;

/*  class responsible for Database operation*/
public class DatabaseUtil {
	
	
	Student arr[] = new Student[1000];
	int count = 0; // act as the current index value of the student
	
	

	public void storeStudent(Student student)
	{
		arr[count++] = student;
	}

	public Student[] getArr() {
		return arr;
	}

	public void setArr(Student[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Student getStudentBasedOnIndexValue(int indexValue)
	{
		// some use case;
		return arr[indexValue];
	}
	
}
