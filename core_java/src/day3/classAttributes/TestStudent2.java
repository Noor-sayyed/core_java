package day3.classAttributes;
import day3.beans.*;

public class TestStudent2 {
	
	public static void main(String[] args) {
		Student student0=new Student(4,"friee","BE");
		Student student1=new Student(5,"driee","ME");
		Student student2=new Student(6,"griee","BBA");
		Student student3=new Student(7,"jree","MBA");
		
		Student[] arrayofStudent= {student0,student1,student2,student3};
		
		TestStudent2 testStudent2 = new TestStudent2();
		testStudent2.displayAllStudents(arrayofStudent);
		
	}
	
	public void displayAllStudents(Student[] arrayofStudent) {
		for(Student student:arrayofStudent) {
			System.out.println(student);
		
	}
	
}
}


