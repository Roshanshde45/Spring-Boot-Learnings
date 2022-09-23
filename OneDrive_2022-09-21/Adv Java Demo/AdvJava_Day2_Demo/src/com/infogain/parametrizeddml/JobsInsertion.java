package com.infogain.parametrizeddml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JobsInsertion {
	public static void main(String[] args) {

		Connection con = null;
		try {
			// loads Driver
			Class.forName("oracle.jdbc.OracleDriver");
			// establish the connection
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");
			String query = "INSERT into jobs VALUES(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, "dp");
			st.setString(2, "deployer");
			st.setInt(3, 13000);
			st.setInt(4, 53000);

			int val = st.executeUpdate();
			System.out.println("1 row affected");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}