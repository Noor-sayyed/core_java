package day5.hashmap;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> mapOfCities=new HashMap<Integer,String>();
		mapOfCities.put(112, "Pune");
		mapOfCities.put(111, "Mumbai");
		mapOfCities.put(113, "Bangalore");
		mapOfCities.put(111, "Hyderabad");
		mapOfCities.put(114, "Delhi");//duplicate values are not allowed 
		//And if they exist it gives the updated value ..here..its Hyderabad instead of Mumbai.
		
		//System.out.println(mapOfCities);
		//print using for each loop
		Set<Integer> keysSet=mapOfCities.keySet(); //keySet is method and keysSet is object reference
		for(int x:keysSet) {
			String city = mapOfCities.get(x);
			//System.out.println(city);  only cities get printed
			System.out.println(x+" " +city);
		}
		
	}

}
