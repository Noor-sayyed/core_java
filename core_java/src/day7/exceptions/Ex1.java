package day7.exceptions;

public class Ex1 {
	public static void main(String[] args) {
		
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[1]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");//Line 7 - System.out.println(myNumbers[7]);
		    }
		finally {
			System.out.println("This is finally block!!");
		}
	}

}
