package day5.hashmap;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		Map<String,String> mapOfStatesAndCities=new HashMap<String,String>();
		//reference of Interface -Left side(Map) : Store objects in reference of Interface
		mapOfStatesAndCities.put("Pune","Maharashtra");
		mapOfStatesAndCities.put("Hyderabad","Telangana");
		mapOfStatesAndCities.put("Gandhigram","Gujrat");
		mapOfStatesAndCities.put("MP","Bhopal");
		mapOfStatesAndCities.put("UP","Bihar");
		//System.out.println(mapOfStatesAndCities);
		Set<String> keysSet=mapOfStatesAndCities.keySet();
	     for(String x:keysSet) {
	    	 String state=mapOfStatesAndCities.get(x);
	    	 System.out.println(x+" "+state);
	     }
	}
}
//we can use int,string,double for key