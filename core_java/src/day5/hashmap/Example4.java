package day5.hashmap;

import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		Map<String,String> mapOfStatesAndCities=new HashMap<String,String>();
		//reference of Interface -Left side(Map) : Store objects in reference of Interface
		mapOfStatesAndCities.put("Pune","Maharashtra");
		mapOfStatesAndCities.put("Hyderabad","Telangana");
		mapOfStatesAndCities.put("Gandhigram","Gujrat");
		mapOfStatesAndCities.put("MP","Bhopal");
		mapOfStatesAndCities.put("UP","Bihar");
		
		Set<String> keysSet=mapOfStatesAndCities.keySet();
		Iterator<String> itr=keysSet.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String state = mapOfStatesAndCities.get(key);
			System.out.println(state);
			}
		
	     
	}
}
