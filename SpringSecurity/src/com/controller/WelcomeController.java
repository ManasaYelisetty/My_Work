package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		PrintWriter out=response.getWriter();
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<TITLE>"  + "First Demo "  +"</TITLE>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.println("<h2> Welcome</h2>");
		out.print("</BODY>");
		out.print("</HTML>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
