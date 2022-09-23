package com.infogain.metadatademo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.infogain.utility.ConnectionProvider;

public class ResultMetaData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con;
		ResultSet rs;
		Statement stmt;
		try {
			con = ConnectionProvider.getConnection();
			Statement ps = con.createStatement();
			rs = ps.executeQuery("select * from employee");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total columns: " + rsmd.getColumnCount());
			System.out.println("Column Name of 1st column: "
					+ rsmd.getColumnName(1));
			System.out.println("Column Type Name of 1st column: "
					+ rsmd.getColumnTypeName(1));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
