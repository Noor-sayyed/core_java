package day4.ArrayList;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		for(String x:cars) {
			System.out.println(x);
		}
		
	}

}
