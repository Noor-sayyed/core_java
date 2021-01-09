package beans;

public class Student {
	
	        private int rollnumber;
			private String studentname;
			private String courses;
			private int durations;
			private int age;	
	 
			
			public Student() {
				
			}

 public Student(int rollnumber, String studentname, String courses, int durations, int age) {
	super();
	this.rollnumber = rollnumber;
	this.studentname = studentname;
	this.courses = courses;
	this.durations = durations;
	this.age = age;
}

public int getRollnumber() {
	return rollnumber;
}

public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public String getCourses() {
	return courses;
}

public void setCourses(String courses) {
	this.courses = courses;
}

public int getDurations() {
	return durations;
}

public void setDurations(int durations) {
	this.durations = durations;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [rollnumber=" + rollnumber + ", studentname=" + studentname + ", courses=" + courses
			+ ", durations=" + durations + ", age=" + age + "]";
}
 
			

}
