package day1.strings;

public class Assg1 {
	public static void main(String[] args) {
		
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";

	    // cmp 1st and 2nd strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // cmp 1st and 3rd strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	  }
}
