/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infogain.metadatademo;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

import com.infogain.utility.ConnectionProvider;
/**
 * 
 * @author alan
 */
public class Dbmd {
	public static void main(String args[]) {
		Connection con = null;
		try {
			con = ConnectionProvider.getConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: "
					+ dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "
					+ dbmd.getDatabaseProductVersion());
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
