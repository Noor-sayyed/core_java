package day4.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
//iterator
public class Ex4 {
	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		
		Iterator<String> itr=cars.iterator();
		while(itr.hasNext()) {
			String x=itr.next();
			System.out.println(x);
			
		}
		
	}

}
