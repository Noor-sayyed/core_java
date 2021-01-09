package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

 public static Connection getMySqlDbConnection() {
String driverClassName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/java_training";
String dbUserName = "root";
String dbPassword = "root123";
Connection con = null;
try {
Class.forName(driverClassName);
con = DriverManager.getConnection(url, dbUserName, dbPassword);

 }catch(Exception e) {
System.out.println("Exception while creating db connection:"+e);
}
return con;
}
}