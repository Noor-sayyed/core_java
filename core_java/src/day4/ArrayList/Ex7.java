package day4.ArrayList;

import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		salariesList.add(25000);
		salariesList.add(86000);
		salariesList.add(50000);
		salariesList.add(10000);
		
		//Collections.sort(salariesList);
		Collections.sort(salariesList,Collections.reverseOrder());
		for(Integer x:salariesList) {
		System.out.println(x);
		}
	}
}
