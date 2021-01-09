package day7.file_handling;
import java.io.*;

//deleting folder
public class Ex5 {
	public static void main(String[] args) {
		 try {
		        File folder = new File("D:\\test1");
		        folder.mkdir(); //to create folder
		        boolean result = folder.exists();
		        if(result) {
		            System.out.println("Folder named test1 exists");
		            System.out.println("Now we are going to delete it.");
		            folder.delete();
		            System.out.println("Deleted Successfully");
		        }else {
		            System.out.println("Folder named test1 does not exists");
		        }
		        }catch(Exception e) {
		            System.out.println("Exception Occured:"+e);
		        }
	}

}
