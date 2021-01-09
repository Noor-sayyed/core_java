package day8.practiceJDbc;

import utility.DBUtil;
import java.sql.*;

public class Example6 {

	// implement jdbc code to check if login is success or failed
		public static void main(String[] args) {
			int rollnumber=100;
			String studentname ="Devyani" ;
			String courses="CoreJava";
			int durations=2;
			int age=22;		
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select * from student where roll_no=?";
			try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollnumber);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
			String courseFromDb = rs.getString("course");
			if(courses.equals(courseFromDb)) {
			System.out.println("Registered Successfully!!!");
			}else {
			System.out.println("Registeration Failed");
			}
			}
			else {
				System.out.println("Not a Registered Student!!");
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}

	}
}

