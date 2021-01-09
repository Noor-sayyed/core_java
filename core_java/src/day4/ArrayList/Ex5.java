package day4.ArrayList;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		salariesList.add(25000);
		salariesList.add(26000);
		salariesList.add(20000);
		salariesList.add(30000);
		for(Integer x:salariesList) {
		System.out.println(x);
		}
	}
}
