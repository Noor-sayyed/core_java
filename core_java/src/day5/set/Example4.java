package day5.set;

import java.util.*;

import day3.classAttributes.Employee;

public class Example4 {

	// create a Set<Employee> which stores 4 Employee objects
	// and then display using for-each loop
	public static void main(String[] args) {
		Employee employee1=new Employee(1001,"Dereck");
		Employee employee2=new Employee(1002,"Alexa");
		Employee employee3=new Employee(1003,"Martina");
		Employee employee4=new Employee(1004,"Luthur");
		
		Set<Employee> employee=new HashSet<Employee>();
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		
		
		System.out.println("for each loop!!\n");
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		
		System.out.println("\nuse iterator!!\n");
		Iterator<Employee> itr=employee.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e);
		}
		
	}
}
