package day5.linkedlist.linkedListOfBeans;

import java.util.*;

import day3.classAttributes.Employee;
public class Example1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Derek");
		Employee employee2 = new Employee(1002, "John");
		Employee employee3 = new Employee(1003, "Peter");
		Employee employee4 = new Employee(1004, "Lisa");

		LinkedList<Employee> employeesList = new LinkedList<Employee>();
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		
		for(Employee e:employeesList) {
		
			System.out.println(e);
		}

		
}
}