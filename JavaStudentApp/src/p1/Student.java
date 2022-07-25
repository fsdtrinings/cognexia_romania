package p1;

public class Student {
	
	private int enrollmentNumber;
	private String name;
	private int screeningScore;
	private String courseName;
	
	 /*
	  *  if score is more than 80/100 : course Java , Spring , Python
	  *  else if score is than 50/100 then HTML , Web Designing
	  * 
	  * */
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int enrollmentNumber, String name, int screeningScore, String courseName) {
		super();
		this.enrollmentNumber = enrollmentNumber;
		this.name = name;
		this.screeningScore = screeningScore;
		this.courseName = courseName;
	}
	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}
	public void setEnrollmentNumber(int enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScreeningScore() {
		return screeningScore;
	}
	public void setScreeningScore(int screeningScore) {
		this.screeningScore = screeningScore;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
