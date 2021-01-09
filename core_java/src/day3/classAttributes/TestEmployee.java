package day3.classAttributes;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
		System.out.println("Updating Employee data in employee object");
		employee.setEmpId(251242);
		employee.setEmpName("Jonardern");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
        System.out.println("After using parameterized construtor...");
		Employee employee2 =new Employee(5252,"Denmark");
		
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());
		
		//implemented toString method 
		System.out.println("************--***********");
		System.out.println(employee2);
	}
}
