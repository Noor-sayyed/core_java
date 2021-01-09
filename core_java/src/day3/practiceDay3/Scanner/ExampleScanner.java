package day3.practiceDay3.Scanner;
import java.util.*;

public class ExampleScanner {
	public static void main(String[] args) {
		String s = "Hello, This is your Assistant";   
        Scanner scan = new Scanner(s);   
        System.out.println("Boolean Result: " + scan.hasNext());  
        System.out.println("String: " +scan.nextLine());  
        scan.close();           
        System.out.println("--------Enter Your Details-------- ");  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        String name = in.next();   
        System.out.println("Name: " + name);           
        System.out.print("Enter your age: ");  
        int i = in.nextInt();  
        System.out.println("Age: " + i);  
        System.out.print("Enter your salary: ");  
        double d = in.nextDouble();  
        System.out.println("Salary: " + d);         
        in.close();           
        }    
	}

