package day8.jdbc;
import java.sql.*;
import java.util.Scanner;
import utility.DBUtil;
public class Example7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	String uname , pass;
	System.out.println("Enter Username : ");
	uname = sc.next();
	System.out.println("Enter Password : ");
	pass = sc.next();
	Connection connect = DBUtil.getMySqlDbConnection();
	String sqlQuery = "select * from login where Username = ?";

	 try {
	PreparedStatement pst = connect.prepareStatement(sqlQuery);
	pst.setString(1, uname);
	ResultSet rs = pst.executeQuery();
	if (rs.next()) {
	String username = rs.getString("Username");
	String password = rs.getString("Password");
	if ((uname.equals(username)) && (pass.equals(password))) {
	System.out.println("Success Login !");
	} else {
	System.out.println("Failed Login !");
	}

	 } else {
	System.out.println("Username not found !");
	}

	 } catch (Exception e) {
	System.out.println("Error occured : " + e);
	}
	
	//int row = rs.getRow();
	//System.out.println("Current Row number : "+row);

}
}