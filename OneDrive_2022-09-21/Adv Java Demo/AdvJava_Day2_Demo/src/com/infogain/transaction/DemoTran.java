package com.infogain.transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DemoTran {
public static void main(String[] args) throws SQLException,
	ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");
		PreparedStatement pstmt = null;
		conn.setAutoCommit(false); // start of transaction

		try {
			pstmt = conn.prepareStatement("insert into jobs values (?, ?,?,?)");
			pstmt.setString(1, "it");
			pstmt.setString(2, "Program");
			pstmt.setInt(3, 30000);
			pstmt.setInt(4, 80000);
	int rowsAffected = pstmt.executeUpdate();
		System.out.println(rowsAffected + " rows affected.");

			// deliberately cause an exception to be thrown
		//int i = 3 / 0; // comment this line for commit to happen
			conn.commit();
			pstmt.close();

		} catch (Exception e) {
			conn.rollback();
			System.err.println("Caught Exception & transaction rollbacked");
		}

		conn.close();
	}
}
