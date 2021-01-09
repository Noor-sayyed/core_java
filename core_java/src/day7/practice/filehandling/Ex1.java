package day7.practice.filehandling;

import java.io.*;
public class Ex1 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("reference.txt");
			myWriter.write("Line:1 Files in Java might be tricky, but it is fun enough!\n");
			myWriter.write("Line:2 This File have core java implementation!\n");
			myWriter.write("Line:3 Files have numerous methods of implementation\n");
			myWriter.append("Refer Blog@ss for more information");//append function
			myWriter.close();
			System.out.println("Sucessfully written in the file!");
			
			
		}
		catch(Exception e) {
			System.out.println("Exception Occured!!");
		}
		
	}

}
