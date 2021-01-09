package day3.practiceDay3.Inheritancee;

public class Teacher {

	private String designation = "Professor";
	private String collegeName = "AISSMS IOIT";
	protected String getDesignation() {
		return designation;
	}
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	protected String getCollegeName() {
		return collegeName;
	}
	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	void does(){
		System.out.println("Teaching");
	   }
}
