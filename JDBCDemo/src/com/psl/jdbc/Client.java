package com.psl.jdbc;

import java.sql.Connection;

public class Client {
public static void main(String[] args) {
	Connect c = new Connect();
	Connection con = c.getConnection();
	
	System.out.println(con.getClass().getName());
	
	c.closeConnection();
}
}
