package com.infogain.callabledemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableDemo {
	public static void main(String args[]) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@//localhost:1521/xe", "system", "hr");
CallableStatement cs2 = con.prepareCall("{call MYPROC(?)}");

			cs2.setString(1, "HR");

			cs2.execute();
			System.out.println("Record Deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}