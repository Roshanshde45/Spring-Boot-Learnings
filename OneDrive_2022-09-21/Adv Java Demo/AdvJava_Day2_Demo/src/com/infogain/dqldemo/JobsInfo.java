package com.infogain.dqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JobsInfo {
	public static void main(String args[]) {
		try {
			String str = "SELECT * FROM jobs";
			/* Initialize and load the JDBC-ODBC Bridge driver */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/* Establish a connection with a data source */
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");
			/* Create a Statement object to process the SELECT statement */
			Statement stmt = con.createStatement();
			/* Execute the SELECT SQL statement */
			ResultSet rs = stmt.executeQuery(str);
			System.out.println("JOB ID\tJOB Title\tMinSalary\tMaxSalary");
			/* Display the result */
			while (rs.next()) {
				String job_id = rs.getString("job_id");
				String job_title = rs.getString("job_title");
				int min_salary = rs.getInt("min_salary");
				int max_salary = rs.getInt("max_salary");

				System.out.print(job_id + "\t");
				System.out.print(job_title + "\t");
				System.out.print(min_salary + "\t");
				System.out.println(max_salary + "\t");

			}
			con.close();
		} catch (Exception ex) {
			System.out.println("Error occurred");
			System.out.println("Error:" + ex);
		}
	}
}
