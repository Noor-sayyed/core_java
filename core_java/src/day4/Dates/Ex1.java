package day4.Dates;

import java.time.LocalDate;
import java.time.*;

public class Ex1 {

	public static void main(String[] args) {
		//display current date
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's date:- "+localDate);
		//display current time
		
		LocalTime localTime=LocalTime.now();
		System.out.println("Today's Time:- "+localTime);
		
		//local Time and date
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("Current Date and Time:- "+localDateTime);
		
	}
}
