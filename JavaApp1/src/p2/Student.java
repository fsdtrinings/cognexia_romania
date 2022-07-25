package p2;

import java.io.Serializable;

// entity / Java bean standards 
public class Student {

	 private int enrollmentNumber;
	 private String studentName;
	 private String course;
	 private int screeningScore;
	 
	 
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

	public Student(int enrollmentNumber, String studentName, String course) {
		this.enrollmentNumber = enrollmentNumber;
		this.studentName = studentName;
		this.course = course;
	}


	

	public int getScreeningScore() {
		return screeningScore;
	}



	public void setScreeningScore(int screeningScore) {
		this.screeningScore = screeningScore;
	}



	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(int enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	 
	 
	
}
