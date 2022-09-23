package com.infogain.dml;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.infogain.utility.ConnectionProvider;
public class CurdDemo {
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	public static void dispMenu() {
		System.out.println("*****Employee Management System******");
		System.out.println("1. AddEmployee ");
		System.out.println("2. ViewEmployee ");
		System.out.println("3. UpdateEmployee ");
		System.out.println("4. DeleteEmployee ");
	}

	public static void insert(int empid, String nm, String add, float sal) {
		try {
			con = ConnectionProvider.getConnection();
			ps = con.prepareStatement("insert into employee values(?,?,?,?) ");
			ps.setInt(1, empid);
			ps.setString(2, nm);
			ps.setString(3, add);
			ps.setFloat(4, sal);
			ps.execute();
			System.out.println("Record Inserted...");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void display() throws Exception {
		con = ConnectionProvider.getConnection();
		ps = con.prepareStatement("select * from employee");
		rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("Emp id is " + rs.getInt(1) + "\n" + "Name is "
					+ rs.getString(2) + "\n Address " + rs.getString(3)
					+ "\n Salary " + rs.getFloat(4));
		}
	}

	public static void updaterec(int r, String nm, String add, float sal)
			throws Exception {
		con = ConnectionProvider.getConnection();
ps = con.prepareStatement("update employee "
		+ "set name=?,address=?,salary=? "
		+ "where empid='"
				+ r + "'");
		ps.setString(1, nm);
		ps.setString(2, add);
		ps.setFloat(3, sal);
		// ps.execute();
		ps.executeUpdate();
		System.out.println("record updated...");
	}

	public static void deleterec(int r) throws Exception {
		con = ConnectionProvider.getConnection();
		ps = con.prepareStatement("delete from employee where empid='"
				+ r + "'");
		ps.execute();
		System.out.println("record deleted...");
	}

	public static void main(String args[]) throws IOException {
		int empId;
		String empName, empAddress;
		float salary;
		String ans = "";
BufferedReader br = new BufferedReader
(new InputStreamReader(System.in));
		int ch;
		do {
			dispMenu();
			System.out.println("Enter your choice ");
			ch = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
			System.out.println("Enter employee Id ");
			empId = Integer.parseInt(br.readLine());

	System.out.println("Enter Employee Name ");
	empName = br.readLine();
		System.out.println("Enter Employee Addres ");
				empAddress = br.readLine();

				System.out.println("Enter Employee salary ");
		salary = Float.parseFloat(br.readLine());
				insert(empId, empName, empAddress, salary);
				break;
			case 2:
				try {
					display();
				} catch (Exception e) {
				}
				break;
			case 3:
				System.out.println("Enter the id to update the record..");
				empId = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee Name ");
				empName = br.readLine();
				System.out.println("Enter Employee Addres ");
				empAddress = br.readLine();
				System.out.println("Enter employee salry ");
				salary = Float.parseFloat(br.readLine());
				try {
					updaterec(empId, empName, empAddress, salary);
				} catch (Exception e) {
				}

				break;
			case 4:
				System.out.println("Enter the id to delete the record..");
				empId = Integer.parseInt(br.readLine());
				try {
					deleterec(empId);
				} catch (Exception e) {
				}
				break;
			}
			System.out.println("Do you want to continue yes/no?");
			ans = br.readLine();
		} while (ans.equalsIgnoreCase("yes"));

	}
}
