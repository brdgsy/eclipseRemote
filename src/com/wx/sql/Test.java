package com.wx.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {	
	public static void main(String[] args) throws Exception {
		String sql = "select * from hero";
		String url = "jdbc:mysql:///myuser";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,"root","brdgsy");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while( rs.next()){
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3));
			
		}
		rs.close();
		st.close();
		conn.close();
		
	}
	

}
