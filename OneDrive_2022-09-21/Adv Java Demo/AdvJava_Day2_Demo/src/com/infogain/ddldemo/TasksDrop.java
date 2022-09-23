package com.infogain.ddldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TasksDrop {
	public static void main(String args[]) {
		try {
			String str = "drop table jobs";

			/* Initialize and load the JDBC-ODBC Bridge driver */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/* Establish a connection with a data source */
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@//localhost:1521/xe", "system", "hr");
			/* Create a Statement object to process the SELECT statement */
			Statement stmt = con.createStatement();
			/* Execute the SELECT SQL statement */
			stmt.execute(str);
			System.out.println("Table dropped Successfully");
			con.close();
		}

		catch (Exception ex) {
			System.out.println("Error occurred");
			System.out.println("Error:" + ex);
		}

	}
}
