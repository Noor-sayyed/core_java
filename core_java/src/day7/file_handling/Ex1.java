package day7.file_handling;

import java.io.*;
public class Ex1 {
	public static void main(String[] args) {
		try {
			File file = new File("courses.txt");
			//File file = new File("D:\\courses.txt"); can also create file using path
			boolean result = file.createNewFile();
			if(result) {
			System.out.println("File successfully got created:"+file.getName());
			}else {
			System.out.println("File Already Exists");
			}
			}
		catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
	}

}
