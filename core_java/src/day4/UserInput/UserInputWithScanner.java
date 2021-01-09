package day4.UserInput;

import java.util.*;

public class UserInputWithScanner {

	public static void main(String[] args) {
		System.out.println("Enter your details");  
        Scanner in = new Scanner(System.in);  
 
        System.out.print("Name : ");    
        String name = in.nextLine();   
        System.out.println("Your Name is : " + name);           
         
                System.out.print("Age : ");  
        int i = in.nextInt();  
        System.out.println("Your Age is : " + i); 
  
        System.out.print("Salary : ");  
        double d = in.nextDouble();  
        System.out.println("Your Salary is :: " + d);   
 
        System.out.print("Married : ");
        boolean isMarried = in.nextBoolean(); 
        System.out.println("Married(true/false) : " + isMarried);
        System.out.println("Congratulations!!!!Your Information is completed!!");
 
        in.close();
	}
}
