package day3.beans;

public class Student {

	private int rollNumber;
	private String studentName;
	private String course;
	
	public Student() {
		
	}
	
	
	
	public Student(int rollNumber, String studentName, String course) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
	}



	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", course=" + course + "]";
	}
	
	
	
	
}
