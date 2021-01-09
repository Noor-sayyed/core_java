package day1.strings;

public class Example6Arpita {
	public static void main(String[] args) {
		int year = (int) (Math.random()*101);
	System.out.println(year);
	boolean isLeap=true;
	if (year%4==0) {
		System.out.println("okay");
		if (year%100==0) {
			System.out.println("okay");
			if(year%400==0) {
				System.out.println("okay");
				System.out.println(isLeap);
			} else {
				System.out.println(isLeap);
			}
		}
	}
	if(isLeap==true) {
		System.out.println(year+" is a leap year and has 366 days");
	} else {
		System.out.println(year+ " is not a leap year and has 365 days");
	}
	}

}
