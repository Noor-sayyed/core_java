package day4.ArrayList;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		//ArrayList cars= new ArrayList();//can use this way also for different data types
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		//cars.add(56.20f);
		//cars.add(6352);
		
		System.out.println(cars);
		//System.out.println(cars.get(0)); //accessing element with indexes
		
		System.out.println("updating Audi to Brezza *****");
		cars.set(0, "Brezza");
		System.out.println(cars);
		
		System.out.println("removing index 2:");
		cars.remove(2);
		System.out.println(cars);
		
		System.out.println("Removing all elements");
		cars.clear();
		System.out.println(cars);
		
		
	}

}
