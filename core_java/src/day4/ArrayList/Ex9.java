package day4.ArrayList;

import java.util.ArrayList;

public class Ex9 {
	public static void main(String[] args) {
		
		ArrayList<Integer> cars=new ArrayList<Integer>();
		cars.add(258);
		cars.add(630);
		cars.add(400);
		cars.add(520);
		for(int i=0;i<cars.size();i++) {
			Integer x=cars.get(i);
			System.out.println(x);
		}
		
	}

}
