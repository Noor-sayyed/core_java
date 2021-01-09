package day5.set;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		Set<Integer> setOfIds=new HashSet<Integer>();
		setOfIds.add(5263);
		setOfIds.add(8956);
		setOfIds.add(4512);
		setOfIds.add(3256);
		setOfIds.add(9764);
		//System.out.println(setOfIds);
		//normal for loop cannot be applied
		for(int i:setOfIds) {
			System.out.println(i);
		}
		
	}

}
