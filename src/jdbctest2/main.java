package jdbctest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet res = null;
	
	static String id = "root";
	static String pw="1234";
	static String url = "jdbc:mysql://localhost:3306/tmpdb";
	
	public static void main(String[] args) {
		
		ConnectDB();
		
		InsertDB("1", "computer", 10);
		InsertDB("2", "laptob", 20);
		InsertDB("3", "phone", 30);
		
		ShowTBL();
		
		UpdateDB();
		
		ShowTBL();
		
		DeleteDB();
		
		disConnectDB();
	}
	
	public static void UpdateDB() {
		try {
			pstmt = conn.prepareStatement("update tbl_product set prod_name = ? where prod_id = ?");
			pstmt.setString(1, "desktop");
			pstmt.setString(2, "1");
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}
	}
	
	public static void DeleteDB() {
		try {
			pstmt = conn.prepareStatement("delete from tbl_product");
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ShowTBL() {
		try {

			
			pstmt = conn.prepareStatement("select * from tbl_product");

			res = pstmt.executeQuery();
			System.out.println("===================");
			while(res.next()) {
				String prod_id = res.getString("prod_id");
				String prod_name = res.getString("prod_name");
				int prod_amount = res.getInt("amount");
				
				System.out.println(prod_id +", "+ prod_name + ", " + prod_amount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void InsertDB(String product_id, String product_name, int amount) {
		
		try{
			pstmt = conn.prepareStatement("insert into tbl_product values('" + product_id + "', '" + product_name + "', " + amount + ")");
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}		

	}
	
	public static void ConnectDB(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
		}catch(Exception e) {
			
		}
	}
	
	public static void disConnectDB(){
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(res != null)res.close();
		}catch(Exception e) {
		
		}
	}
}
