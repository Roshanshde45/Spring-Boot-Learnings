package com.infogain.parametrizeddml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JobsDeletion {
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
			String query = "delete from jobs where job_id=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, "dp");
			int record = st.executeUpdate();
			System.out.println(record + "Record deleted Successfully");
		} catch (Exception ex) {
			System.out.println("Error:" + ex);
		}
	}
}
