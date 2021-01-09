package day8.practiceJDbc;
import java.sql.*;
//insert data to student table using Prepared Statement
public class Example4 {
	
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 106);
			pst.setString(2, "Rehansh");
			pst.setString(3, "Photoshop");
			pst.setInt(4, 8);
			pst.setInt(5,18);
			
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
