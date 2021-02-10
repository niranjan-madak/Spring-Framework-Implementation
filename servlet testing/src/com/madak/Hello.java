package com.madak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hello
 */
//@WebServlet(description = "this is hello sevlet", urlPatterns = { "/hello" })
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=(String)request.getParameter("t1");
		PrintWriter out =response.getWriter();
		out.println("hey "+uname +" "+"! this is hello servlet !");
		
		
		 ServletConfig config=getServletConfig();
		 out.print(config.getInitParameter("username"));
		 
		String fullname=uname+"madak";
		Cookie cook=new Cookie("fullname", fullname+"");
		 response.addCookie(cook);
		
		response.sendRedirect("welcome");
		
		
	}

}
