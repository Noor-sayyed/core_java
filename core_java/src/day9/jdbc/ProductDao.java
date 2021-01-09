package day9.jdbc;
//Example1 class
import java.sql.*;
import java.util.*;
import beans.Product;
import utility.DBUtil;

import utility.DBUtil;

public class ProductDao {
	
	
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
	
	public void deleteProduct(int productId) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from product where product_id=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, productId);
		int result = pst.executeUpdate();
		if(result==0) {
		System.out.println("The product with given id does not exist");
		}else {
		System.out.println("Successfully deleted");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	
    public void updateProduct(Product product) {
    	Connection con = DBUtil.getMySqlDbConnection();
    	String sql = "update product set product_name=?, price=? where product_id=?";
    	try {
    		PreparedStatement pst = con.prepareStatement(sql);
    		pst.setString(1,product.getProductName());
    		pst.setInt(2,product.getPrice());
    		pst.setInt(3,product.getProductId());
    		    				
    		int result=pst.executeUpdate();
    		if(result==0) {
    			System.out.println("The product with given Id does not exist");
    		}else {
    			System.out.println("record updated successfully");
    		}
    		
    	}catch(Exception e) {
    		System.out.println("Exception occured!!");
    	}
    }






}



