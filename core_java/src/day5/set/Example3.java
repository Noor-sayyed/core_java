package day5.set;

import java.util.*;

public class Example3 {
	
	public static void main(String[] args) {
		Set<String> course=new HashSet<String>();
		course.add("Oracle");
		course.add("Java");
		course.add("Python");
		course.add("Cloud");
		course.add("DBMS");
		
		System.out.println("using for each loop!!");
		for(String x:course) {
			System.out.println(x);
		}
		
		System.out.println("using Iterator!!");
		
		Iterator<String> itr=course.iterator();
		while(itr.hasNext()) {
			String x=itr.next();
			System.out.println(x);
		}
		
	}

}
