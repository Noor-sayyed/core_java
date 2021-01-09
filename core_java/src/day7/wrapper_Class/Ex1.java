package day7.wrapper_Class;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    
	    /*
	     * To create a wrapper object, use the wrapper class instead of the primitive type.
	     *  To get the value, you can just print the object:
	     */
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	  
	    /*
	     *  the following methods are used to get the value associated with the 
	     *  corresponding wrapper object: intValue(), byteValue(),
	     *   shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
	     */
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	    
	    //useful method is the toString() method, which is used to convert wrapper objects to strings
	    Integer myInt1 = 100;
	    String myString = myInt1.toString();
	    System.out.println(myString.length());
	}

}
