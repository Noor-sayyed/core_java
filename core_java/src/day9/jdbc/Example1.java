package day9.jdbc;

import java.sql.*;
import java.util.*;
import beans.Product;
import utility.DBUtil;

public class Example1 {

	public static void main(String[] args) {
		Product product1=new Product(2,"Mobile",20000);
        ProductDao example1=new ProductDao();
       // example8.addProduct(product1);
        //example1.getAllProducts();
      //  example1.getProduct(2);
       // example1.deleteProduct(3);
        
        Product product=new Product(2,"Tablet",28000);
        example1.updateProduct(product);
		
}
}
	
	
	















	/*
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
	//fetching value from database
	public void getAllProducts() {
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="select * from product";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			  int productId=rs.getInt("product_id");
			  String productName = rs.getString("product_name");
			  int price = rs.getInt("price");
			  System.out.println("productId:"+productId);
			  System.out.println("productName:"+productName);
			  System.out.println("price:"+price);
			  System.out.println("***************************");
			}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
	}
	
	public void getProduct(int productId) {
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="select * from product where product_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String pnameFromDb = rs.getString("product_name");
				int price=rs.getInt("price");
				
				System.out.println("productId:"+productId);
				//System.out.println("productName:"+productName);
				System.out.println("price:"+price);
		}
			else {
			System.out.println("ProductId you mentioned does not exist");
		}
		}
			catch(Exception e) {
			System.out.println("Exception occured!");
		}
	
}
*/
	
