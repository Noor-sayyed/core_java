package day5.hashmap;

import java.util.*;

import day3.classAttributes.Employee;

/*
 * Write a class in which in main method, you create a
Map<Integer, Employee> . Key you can take as employeeId
and value will be Employee object.
Then write code to display it in both styles:
1) with for-each loop
2) with Iterator
 */
public class Example5 {
public static void main(String[] args) {
	Employee employee1 = new Employee(1001, "KATINA");
	Employee employee2 = new Employee(1002, "RANDY");
	Employee employee3 = new Employee(1003, "DIEOGO");
	Employee employee4 = new Employee(1004, "MIA");
	
	Map<Integer,Employee> hashemployeesList=new HashMap<Integer,Employee>();
	hashemployeesList.put(1007, employee1);
	hashemployeesList.put(1009,employee2);
	hashemployeesList.put(1056,employee3);
	hashemployeesList.put(1089,employee4);
	
	Set<Integer> keyOfSet=hashemployeesList.keySet();
	Iterator<Integer> itr=keyOfSet.iterator();
	
	System.out.println("Displaying using for each loop!!");
	for(int x:keyOfSet) {
		Employee employee=hashemployeesList.get(x);
		System.out.println(x+" "+employee);
	}
	System.out.println("\nDisplaying using Iterator!!");
	while(itr.hasNext()) {
		int key=itr.next();
		Employee e = hashemployeesList.get(key);
		System.out.println(key+" "+e);
		
	}
	
	
}

}

