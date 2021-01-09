package day7.file_handling;

import java.io.*;
public class Ex2 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("courses.txt");
			myWriter.write("Line:1 Files in Java might be tricky, but it is fun enough!\n");
			myWriter.write("Line:2 This File have core java implementation!\n");
			myWriter.write("Core Java\n");
			myWriter.write("Python\n");
			//myWriter.append("C#");//append function
			myWriter.close();
			System.out.println("Sucessfully written in the file!");
			
			
		}
		catch(Exception e) {
			System.out.println("Exception Occured!!");
		}
		
	}

}
