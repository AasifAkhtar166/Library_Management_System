package com.library.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.model.DAOServiceImpl;

@WebServlet("/addBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public AddBook() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
        String author = request.getParameter("author");
		
        DAOServiceImpl service = new DAOServiceImpl();
        service.connectDB();
        service.saveBooks(title, author);
        request.setAttribute("msg", "Record is saved!!");
		RequestDispatcher rd = request.getRequestDispatcher("addBook.jsp");
		rd.forward(request, response);
	}

}
