package day8.practiceJDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) {
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="root123";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: "+con);
			
			String sql = "select * from student";
			// Statement or PreparedStatement
			// First giving demo using Statement
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql); // for select queries, we use executeQuery() method
			while(rs.next()) {
			int rollnumber = rs.getInt("roll_no");
			String studentname = rs.getString("student_name");
			String courses=rs.getString("course");
			int durations=rs.getInt("duration");
			int age=rs.getInt("age");		
			System.out.println("RollNumber:"+rollnumber);
			System.out.println("StudentName:"+studentname);
			System.out.println("Course:"+courses);
			System.out.println("Duration:"+durations);
			System.out.println("Age:"+age);
			System.out.println("**************************");
			}
			
			}
		catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}	
	}
}
