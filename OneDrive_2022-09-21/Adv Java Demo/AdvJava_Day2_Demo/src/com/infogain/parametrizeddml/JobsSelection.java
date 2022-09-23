package com.infogain.parametrizeddml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JobsSelection {
	public static void main(String args[]) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/";
		String dbName = "XE";
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String userName = "system";
		String password = "hr";
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url + dbName, userName, password);
			String query = "SELECT * FROM jobs where job_id=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, "dp");
			/* Execute the SELECT SQL statement */
			ResultSet rs = stmt.executeQuery();
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
