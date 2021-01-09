package day3.practiceDay3.Inheritancee;

public class Subject extends Teacher {
	
	String mainSubject = "JAVA";
	
	public static void main(String[] args) {
		Subject subject=new Subject();
		System.out.println(subject.getCollegeName());
		System.out.println(subject.getDesignation());
		System.out.println(subject.mainSubject);
		subject.does();
	}

}


/*
 *the child class is able to access the private members of parent class through
 * protected methods of parent class. When we make a instance variable(data member) 
 * or method protected, 
 *this means that they are accessible only in the class itself and in child class.  
 */
