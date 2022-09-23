package com.infogain.metadatademo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class ColumnName {
	public static void main(String[] args) {
		System.out.println("Getting Column Names Example!");
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@//localhost:1521/xe", "system", "hr");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Jobs");
			ResultSetMetaData md = rs.getMetaData();
			int col = md.getColumnCount();
			System.out.println("Number of Column : " + col);
			System.out.println("Column names\tType ");
			for (int i = 1; i <= col; i++) {
				String col_name = md.getColumnName(i);
				String col_type = md.getColumnTypeName(i);
				System.out.print(col_name + "\t" + col_type);
				System.out.println("");
			}
		} catch (Exception s) {
			System.out.println("SQL statement is not executed!");
		}
	}
}
