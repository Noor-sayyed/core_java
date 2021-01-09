package day3.ScannerExample;

//import java.util.Scanner;
import java.util.*; //instead of only scanner class import whole package i.e *

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Name : ");
		String name=sc.nextLine();
		System.out.println("Name is : "+name);
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Your age is: "+age);
	}

}
