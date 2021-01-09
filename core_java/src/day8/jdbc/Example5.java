package day8.jdbc;

import utility.DBUtil;

import java.sql.*;

public class Example5 {
// implement jdbc code to check if login is success or failed
	public static void main(String[] args) {
		String userName = "admin";
		String password = "zensar";
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from login where user_name=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, userName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		String passwordFromDb = rs.getString("password");
		if(password.equals(passwordFromDb)) {
		System.out.println("Login Successful");
		}else {
		System.out.println("Login Failed");
		}
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}

}
}
