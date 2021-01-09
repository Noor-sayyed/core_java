package day2.ForLoop;

public class Example3 {
// for each loop for array of string values 
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for(String c:cars) {  //for each loop
			System.out.println(c);//String c = cars[i];   //best practice to use a variable to print the string
		}
	}
}
