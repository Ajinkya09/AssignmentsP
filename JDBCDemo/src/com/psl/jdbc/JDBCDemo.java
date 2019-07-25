package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Load Driver");

			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			PreparedStatement pstmt = con
					.prepareStatement("insert into bikes values(?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id :");
			int id = sc.nextInt();
			System.out.println("Enter bike name :");
			String name = sc.next();

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.execute();
			ResultSet rs = pstmt.executeQuery("select * from bikes");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			// Statement stmt = con.createStatement();
			// stmt.execute("Create table bikes(bikeid int(10), bikename varchar(20))");
			// stmt.execute("insert into bikes values(123,'Royal Enfield')");
			// stmt.execute("insert into bikes values(456,'JaWa')");
			// stmt.execute("insert into bikes values(789,'Indian')");

			System.out.println("Done..!!");

			pstmt.close();
			con.close();
			sc.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
