package org.study.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectTest {
	
	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "sys as sysdba", "1004Aa011");
		return conn;
	}

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = getConnection();
			System.out.println(conn.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
