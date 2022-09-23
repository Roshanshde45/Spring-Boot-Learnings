package com.infogain.parametrizeddml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JobsUpdation {
	public static void main(String args[]) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/";
		String dbName = "XE";
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String userName = "system";
		String password = "hr";
		try {
			Class.forName(driverName).newInstance();
			con = DriverManager.getConnection(url + dbName, userName, password);

			String query = "UPDATE jobs SET min_salary=?	WHERE job_id=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, 19000);
			st.setString(2, "hr");
			int row = st.executeUpdate();
			System.out.println(row + " updated Successfully");
			con.close();
		}

		catch (Exception ex) {
			System.err.println("Error:" + ex);
		}

	}
}
