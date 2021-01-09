package day7.file_handling;

//delete the file

import java.io.*;
public class Ex4 {
	public static void main(String[] args) {
		File file = new File("courses.txt");
		boolean fileExists = file.exists();
		if(fileExists) {
		System.out.println("This file exists.");
		System.out.println("Now going to delete this file...");
		boolean deletioSuccessful = file.delete();
		if(deletioSuccessful) {
		System.out.println("File deleted successfully!!");
		}else {
		System.out.println("File Deletion failed");
		}
		}else {
		System.out.println("This file does not exist");
		}
	}

}
