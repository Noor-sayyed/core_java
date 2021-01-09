package day7.practice.filehandling;

//we use the Scanner class to read the contents of the text file we created
import java.io.*;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		File file=new File("refernce.txt");    //reference
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
				System.out.println(s);
			}
			sc.close();  //close scanner	
		} 
		catch (FileNotFoundException e) {
			System.out.println("Exception Occured!!");
		}
		
	}

}
