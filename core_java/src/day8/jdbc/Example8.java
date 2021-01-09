package day8.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import beans.Product;
import utility.DBUtil;

public class Example8 {

	public static void main(String[] args) {
		Product product1=new Product(1,"Laptop",52000);
        Example8 example8=new Example8();
        example8.addProduct(product1);
		
}
	public void addProduct(Product product){
		System.out.println("Now going to insert product into DB: \n"+product);
		Connection con=DBUtil.getMySqlDbConnection();
		String sql= "insert into product values(?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getPrice());
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
}
