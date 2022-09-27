package com.xworkz.beach.myserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 5, urlPatterns = "/pra")
public class MyServer3 extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is Servlet Program");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html><head><body bgcolor='black'><h1 style='color:white'>"		
				+ "The background Color is Black</h1></body></head></html>");

	}

}
