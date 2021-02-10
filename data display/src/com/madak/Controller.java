package com.madak;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		List<Data> list = new ArrayList<Data>();
		list.add(new Data(1603510028, "Niranjan Madak", "BBDIT Ghaziabad", "B.Tech", "CSE", "AKTU", "Duhai Ghaziabad",
				"2020", "First Division with Honours"));
		list.add(new Data(1603510033, "Priyanka yadav", "BBDIT Ghaziabad", "B.Tech", "CSE", "AKTU", "Duhai Ghaziabad",
				"2020", "First Division with Honours"));
		list.add(new Data(1603510023, "Honey Mehta", "BBDIT Ghaziabad", "B.Tech", "CSE", "AKTU", "Duhai Ghaziabad",
				"2020", "First Division with Honours"));

		list.add(new Data(1603510017, "Deepak Ahirwar", "BBDIT Ghaziabad", "B.Tech", "CSE", "AKTU", "Duhai Ghaziabad",
				"2020", "First Division with Honours"));
		
		request.setAttribute("details", list);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);


	}

}
