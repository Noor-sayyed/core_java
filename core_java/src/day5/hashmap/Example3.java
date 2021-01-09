package day5.hashmap;

import java.util.*;
//use iterator to iterate over key Set
public class Example3 {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> mapOfCities=new HashMap<Integer,String>();
		mapOfCities.put(112, "Pune");
		mapOfCities.put(111, "Mumbai");
		mapOfCities.put(113, "Bangalore");
		mapOfCities.put(111, "Hyderabad");
		mapOfCities.put(114, "Delhi");//duplicate values are not allowed 
		//And if they exist it gives the updated value ..here..its Hyderabad instead of Mumbai.
		
		//System.out.println(mapOfCities);
		Set<Integer> keysSet=mapOfCities.keySet();
		Iterator<Integer> itr=keysSet.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
	}

}
