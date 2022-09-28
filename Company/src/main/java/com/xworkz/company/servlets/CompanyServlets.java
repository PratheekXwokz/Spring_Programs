package com.xworkz.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.company.dto.CompanyDTO;

@WebServlet(loadOnStartup = 7, urlPatterns = { "/company", "/details" })
public class CompanyServlets extends HttpServlet {
	List<CompanyDTO> dto = new ArrayList<CompanyDTO>();

	public CompanyServlets() {
		System.out.println("Company Servlet Created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Using Post Method To Get Data");
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String founder = req.getParameter("founder");
		String established = req.getParameter("since");
		String employees = req.getParameter("employees");
		String address = req.getParameter("address");
		String business = req.getParameter("business");

		System.out.println("Name of The Company Is:" +name);
		System.out.println("Founder Of The Company Is:" +founder);
		System.out.println("The Company was Established in:" +established);
		System.out.println("The Number Of Employees in The Company are:" +employees);
		System.out.println("The Company is Located at:" +address);
		System.out.println("The Company Bussiness Works On:" +business);

		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("Company Name is:  ").append(name).append("<br>")
				.append("Company Founder is: ").append(founder).append("<br>").append("Company was established in:  ")
				.append(established).append("<br>").append("Number of  Employees in The Company:  ").append(employees)
				.append("<br>").append("Company is Located at:  ").append(address).append("<br>")
				.append("Company Business field is:  ").append(business).append("</body>").append("</html>");

		CompanyDTO companyInfo = new CompanyDTO(name, founder, established, employees, address, business);
		boolean save = dto.add(companyInfo);
		System.out.println(save);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling doGet Method");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("<h3>").append("The Company Details Entered are")
				.append("</h3>").append("<Table>");
		for (CompanyDTO companyDTO : dto) {
			writer.append("<tr>").append("<td>").append(companyDTO.getName()).append("</td>").append("<td>")
					.append(companyDTO.getFounder()).append("</td>").append("<td>").append(companyDTO.getSince())
					.append("</td>").append("<td>").append(companyDTO.getNoOfEmployees()).append("</td>").append("<td>")
					.append(companyDTO.getAddress()).append("</td>").append("<td>").append(companyDTO.getBusiness())
					.append("</td>").append("</tr>");
		}
		writer.append("</Table>").append("</body>").append("</html>");
	}
}
