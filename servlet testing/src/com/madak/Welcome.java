package com.madak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet(name = "Welcome", description = "this is Welcome servlet", urlPatterns = { "/Welcome" })
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 PrintWriter out = response.getWriter();
	 String name=null;
	 Cookie cook[]=request.getCookies();
	 
	 for(Cookie c:cook) {
		 if(c.getName().equals("fullname")){
			  name=c.getValue();
		 }
	 }


	 out.println("hi "+name+"this is Welcome servlet !");
	 
	 ServletContext context=request.getServletContext();
	String nm= context.getInitParameter("username");
	out.print(nm);

	 
	}

}
