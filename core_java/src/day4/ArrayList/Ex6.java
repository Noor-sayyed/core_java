package day4.ArrayList;

import java.util.*;

/*
*
* adding of values in arraylist using scanner and loops
* run a for loop to add four cities in arraylist of string and then display all of them
* names of cities should be received by user-input using Scanner
*/
public class Ex6 {
	public static void main(String[] args) {
		ArrayList<String> listOfCities = new ArrayList<String>();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter number of cities you are willing to add:");
		int n = sc1.nextInt();
		for(int i=0; i<n; i++) {
		System.out.println("Enter a city Name:");
		String city = sc2.nextLine();
		listOfCities.add(city);
		}
		System.out.println(listOfCities);
	}

}
