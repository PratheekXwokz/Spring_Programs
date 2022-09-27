package com.xworkz.fire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/abc")
public class FireServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("This is Servlet Program");
		String name=req.getParameter("alias");
		String company=req.getParameter("company");
		String salary=req.getParameter("salary");
		System.out.println("Name is: "+name);
		System.out.println(" Salary is "+salary);
		System.out.println(" Company is "+company);

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html><body><h1>This is Placement Details</h1>")
		.append(name)
		.append("<br>")
		.append(company)
		.append("<br>")
		.append(salary)
		.append("<br>")
		.append("</body></html>");

	}

}
