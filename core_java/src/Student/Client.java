package Student;

public class Client {


	public static void main(String[] args) {
		Student s=new Student();
		s.accept();
		s.calGrade();
		System.out.println(s);
		Student s1=new Student();
		s1.accept();
		s1.calGrade();
		System.out.println(s1);
		if(s.equals(s1))
			System.out.println("Grades are same!");
		else
			System.out.println("Grades are not same!");
		
	}

}
