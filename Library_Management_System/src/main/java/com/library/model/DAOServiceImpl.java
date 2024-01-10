package com.library.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	
	private Connection con;
	private Statement stmnt;
	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","test");
			stmnt=con.createStatement();
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

	@Override
	public void saveBooks(String title, String author) {
		
		try {
			stmnt.executeUpdate("insert into books values('"+title+"', '"+author+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet readAllBooks() {
		try {
			ResultSet result = stmnt.executeQuery("select * from books");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
