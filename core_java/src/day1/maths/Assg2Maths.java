package day1.maths;

public class Assg2Maths {
	public static void main(String args[]) 
    { 
        // define the range 
        int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 10 
        for (int i = 0; i < 10; i++) { 
            int rand = (int)(Math.random() * range) + min; 
  
            // Output is different everytime this code is executed 
            System.out.println(rand); 
        } 
    } 

}
