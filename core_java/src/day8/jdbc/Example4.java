package day8.jdbc;
import java.sql.*;
//insert data to login table using Prepared Statement
public class Example4 {
	
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into login values (?,?)";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, "user");
		pst.setString(2, "4567");
		int result = pst.executeUpdate(); // this method can be used for insert/update/delete queries
		if(result==0) {
		System.out.println("Insertion Failed");
		}else {
		System.out.println("Data Inserted Successfully");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
	}
	
	public static Connection getMySqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root123";
		Connection con = null;
		try {
		Class.forName(driverClassName);
		con = DriverManager.getConnection(url, dbUserName, dbPassword);

		 }
		catch(Exception e) {
		System.out.println("Exception while creating db connection:"+e);
		}
		return con;
		}

}
