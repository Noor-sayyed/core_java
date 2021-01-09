package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Student;
import utility.DBUtil;

public class StudentDao {
	
	public void addStudent(Student student){
		System.out.println("Student Details Adding!!! \n"+student);
		Connection con=DBUtil.getMySqlDbConnection();
		String sql= "insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getRollnumber());
			pst.setString(2,student.getStudentname());
			pst.setString(3,student.getCourses());
			pst.setInt(4, student.getDurations());
			pst.setInt(5,student.getAge());
			int result = pst.executeUpdate();
			if(result==0) {
			System.out.println("Query Failed");
			}else {
			System.out.println("Success!!");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}

	}
	
	//fetching value from database
		public void getAllStudents() {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="select * from student";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
				  int rollnumber=rs.getInt("roll_no");
				  String studentname = rs.getString("student_name");
				  String courses=rs.getString("course");
				  int durations=rs.getInt("duration");
				  int age=rs.getInt("age");
				  System.out.println("rollnumber:"+rollnumber);
				  System.out.println("studentname:"+studentname);
				  System.out.println("courses:"+courses);
				  System.out.println("durations:"+durations);
				  System.out.println("age:"+age);
				  System.out.println("***************************");
				}
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
		}
	
		public void getStudent(int rollNumber) {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="select * from student where roll_no=?";
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1,rollNumber);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					int rollnumber=rs.getInt("roll_no");
					String studentname=rs.getString("student_name");
					String courses=rs.getString("course");
					int durations=rs.getInt("duration");
					int age=rs.getInt("age");
					
					System.out.println("RollNumber: "+rollNumber);
					System.out.println("StudentName: "+studentname);
					System.out.println("courses: "+courses);
					System.out.println("Age: "+age);
							
			}
				else {
				System.out.println("Student you mentioned does not exist");
			}
			}
				catch(Exception e) {
				System.out.println("Exception occured!");
			}
		}
		
		public void getStudentName(String studentName) {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="select * from student where student_name=?";
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,studentName);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					
					String studentname=rs.getString("student_name");
					int rollnumber=rs.getInt("roll_no");
					String courses=rs.getString("course");
					int durations=rs.getInt("duration");
					int age=rs.getInt("age");
					
					System.out.println("RollNumber: "+rollnumber);
					System.out.println("StudentName: "+studentname);
					System.out.println("courses: "+courses);
					System.out.println("Age: "+age);
							
			}
				else {
				System.out.println("Student you mentioned does not exist");
			}
			}
				catch(Exception e) {
				System.out.println("Exception occured!");
			}
			
		}
		
		public void deleteStudent(int rollnumber) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "delete from student where roll_no=?";
			try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollnumber);
			int result = pst.executeUpdate();
			if(result==0) {
			System.out.println("The Student with given roll no. does not exist");
			}else {
			System.out.println("Successfully deleted");
			}
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}
		
		
	
		public void updateStudent(Student student) {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="update student set student_name=?,course=?,duration=?,age=? where roll_no=?";
			
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,student.getStudentname());
				pst.setString(2,student.getCourses());
				pst.setInt(3,student.getDurations());
				pst.setInt(4,student.getAge());
				pst.setInt(5,student.getRollnumber());
			
				int result=pst.executeUpdate();
	    		if(result==0) {
	    			System.out.println("The Student with given roll no. does not exist");
	    		}else {
	    			System.out.println("record updated successfully");
			}
				
			}catch(Exception e) {
				
				
			}
		}


}
