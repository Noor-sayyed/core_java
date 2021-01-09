package day8.practiceJDbc;

import utility.DBUtil;
import java.sql.*;

public class Example5 {

	// implement jdbc code to check if login is success or failed
		public static void main(String[] args) {
			int rollnumber=101;
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
			while(rs.next()) {
			String courseFromDb = rs.getString("course");
			if(courses.equals(courseFromDb)) {
			System.out.println("Registered Successfully!!!");
			}else {
			System.out.println("Registeration Failed");
			}
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}

	}
}
