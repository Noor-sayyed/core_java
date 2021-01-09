package day6.ArrayList;
import java.util.*;
import day6.bean.Passenger;

//Implement code with ArrayList with Passanger bean and Iterator
public class Ex3 {
	public static void main(String[] args) {
		
		Passenger passenger1=new Passenger("Juliet", 10521);
		Passenger passenger2=new Passenger("Ashley", 10522);
		Passenger passenger3=new Passenger("Miami", 10523);
		Passenger passenger4=new Passenger("Camilla", 10524);
		Passenger passenger5=new Passenger("Camilla", 10524);
		
		ArrayList<Passenger> arrayList=new ArrayList<Passenger>();
		arrayList.add(passenger1);
		arrayList.add(passenger2);
		arrayList.add(passenger3);
		arrayList.add(passenger4);
		
		System.out.println("Using Iterator!!");
		Iterator<Passenger> itr=arrayList.iterator();
	    	while(itr.hasNext()) {
	    		Passenger p=itr.next();
	    		System.out.println(p);

	    	}
		
	}

}
