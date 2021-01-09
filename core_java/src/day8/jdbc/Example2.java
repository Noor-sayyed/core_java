package day8.jdbc;

import java.sql.*;
//Demo jdbc connection
public class Example2 {

	public static void main(String[] args) {
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="root123";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: "+con);
			
			String sql = "select * from login";
			// Statement or PreparedStatement
			// First giving demo using Statement
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(); // for select queries, we use executeQuery() method
			while(rs.next()) {
			String userName = rs.getString("user_name");
			String password = rs.getString("password");
			System.out.println("userName:"+userName);
			System.out.println("password:"+password);
			System.out.println("**************************");
			}
			
			}
		catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}	
	
	}
}
