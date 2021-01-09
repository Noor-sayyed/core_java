package day1.ifElse;

public class Example3 {

	public static void main(String[] args) {
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		/*USE OF TERNARY OPERATOR
		 * variable = (condition) ? expressionTrue :  expressionFalse;
		 * 
		 * EXAMPLE:-
		 * int time = 20;
          String result = (time < 18) ? "Good day." : "Good evening.";
		 * */

	}
}
