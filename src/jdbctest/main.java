package jdbctest;

import java.sql.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		
		
		String id = "root";
		String pw="1234";
		String url = "jdbc:mysql://localhost:3306/tmpdb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			pstmt = conn.prepareStatement("insert into tbl_std values('name3', 'addr3', 'phone3')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("select * from tbl_std");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String std_name = rs.getString("name");
				String std_addr = rs.getString("addr");
				String std_phone = rs.getString("phone");
				
				System.out.println(std_name +", "+ std_addr + ", " + std_phone);
			}
			
			System.out.println("done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null)rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
