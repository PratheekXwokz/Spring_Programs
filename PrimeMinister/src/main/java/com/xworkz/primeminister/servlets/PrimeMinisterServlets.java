package com.xworkz.primeminister.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5,urlPatterns = "/prime")
public class PrimeMinisterServlets extends HttpServlet {
	
	public PrimeMinisterServlets() {
		System.out.println("Default Constructor Created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Using DoPost Method");
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String mStatus = req.getParameter("status");
		String party = req.getParameter("party");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String duration = req.getParameter("duration");
		String noOfTimes = req.getParameter("elected");
				
		System.out.println(name);
		System.out.println(country);
		System.out.println(mStatus);
		System.out.println(party);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(duration);
		System.out.println(noOfTimes);
		
		req.setAttribute("nm", name);
		req.setAttribute("cn",country);
		req.setAttribute("ms", mStatus);
		req.setAttribute("pt", party);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		req.setAttribute("dur", duration);
		req.setAttribute("times", noOfTimes);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/success.jsp");
		dispatcher.forward(req, resp);
	}
}