package day6.ArrayList.ArrayListCollection;

import java.util.*;

//demo of parameterized constructor of ArrayList
//new ArrayList Collection(c)
public class Example1 {
	public static void main(String[] args) {
		Set<String> cars = new HashSet<String>();
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Renault");
		cars.add("Kia");
		List<String> listOfCars = new ArrayList<String>(cars);
		displayList(listOfCars);
		}
		public static void displayList(List<String>list1) {
		for(String x:list1) {
		System.out.println(x);
		}
	}

}
