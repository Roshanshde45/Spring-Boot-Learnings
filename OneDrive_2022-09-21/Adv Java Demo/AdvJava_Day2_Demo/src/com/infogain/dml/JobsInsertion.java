package com.infogain.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JobsInsertion {
	public static void main(String[] args) {
		System.out.println("Inserting values in Mysql database table!");
		Connection con = null;
		Statement st = null;
		try {
			// loads Driver
			Class.forName("oracle.jdbc.OracleDriver");
			// establish the connection
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");
			// create the statement object
			st = con.createStatement();
			// int val = st
			// .executeUpdate("INSERT into jobs(job_id,JOB_TITLE) VALUES('ts',	'tester')");
			int val1 = st
				.executeUpdate("INSERT into jobs VALUES('AC',	'Account',40000,70000)");
			System.out.println("1 row affected");
		} catch (Exception s) {
			System.out.println(s.toString());
		}

	}
}