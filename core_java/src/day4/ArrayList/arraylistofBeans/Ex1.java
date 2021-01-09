package day4.ArrayList.arraylistofBeans;

import java.util.ArrayList;

import day3.classAttributes.Employee;

public class Ex1 {

	public static void main(String[] args) {
		Employee employee1=new Employee(1001,"Dereck");
		Employee employee2=new Employee(1002,"Alexa");
		Employee employee3=new Employee(1003,"Martina");
		Employee employee4=new Employee(1004,"Luthur");
			
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		for(Employee employee:employeesList) {
		System.out.println(employee);
		}
		}
		
	}
