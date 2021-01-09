package day4.ArrayList;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		for(int i=0;i<cars.size();i++) {
			String x=cars.get(i);
			System.out.println(x);
		}
		
	}

}
