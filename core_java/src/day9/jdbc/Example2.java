package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import beans.Student;
import utility.DBUtil;

public class Example2 {

	public static void main(String[] args) {
		
		Student student1=new Student(109,"Blaze Clayton","DataAnalyst",10,40);
        Example2 example7=new Example2();
       // example7.addStudent(student1);
       // example7.getAllStudents();
        //example7.getStudent(101);
		
        StudentDao dao=new StudentDao();
       // dao.getAllStudents();
       // dao.addStudent(student);
        //dao.getStudent(109);
       // dao.getStudentName("Devyani");
        //dao.deleteStudent(106);
        
        //Student student=new Student(104,"Samayrah","C++",5,20);  updating all values
        //updating single values
        Student student=new Student(104,"Samayrah","C#",5,20);
        dao.updateStudent(student);
}
	
}