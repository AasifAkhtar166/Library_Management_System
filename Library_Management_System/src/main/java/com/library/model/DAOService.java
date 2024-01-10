package com.library.model;

public interface DAOService {
	public void connectDB();
	public void saveBooks(String title, String author);

}
