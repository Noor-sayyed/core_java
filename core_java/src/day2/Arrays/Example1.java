package day2.Arrays;

public class Example1 {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; //array of string values
		//System.out.println(cars[0]);
		//System.out.println(cars[1]);
		//System.out.println(cars[2]);
		//System.out.println(cars[3]);
		System.out.println(cars.length);  //length is a property not method
		//for(int i=0; i<=cars.length; i++) {//gives error 
		for(int i=0; i<cars.length; i++) {
			//System.out.println(cars[i]);
			String car = cars[i];   //best practice to use a variable to print the string
			System.out.println(car);
			
		}
		
	}
}
