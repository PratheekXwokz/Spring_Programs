package com.xworkz.form.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.FormDTO;

@WebServlet(loadOnStartup = 5, urlPatterns = "/job")
public class FormServlet extends HttpServlet {
	List<FormDTO> dto = new ArrayList<FormDTO>();

	public FormServlet() {
		System.out.println("Form Has Been Created");

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Calling Service method");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phnumber = req.getParameter("phnumber");
		String alternate = req.getParameter("alternate");
		String gender = req.getParameter("gender");
		String qualification = req.getParameter("qualification");
		String yop = req.getParameter("yop");
		String university = req.getParameter("uni");
		String skills = req.getParameter("skill");
		String address = req.getParameter("address");
		String salary = req.getParameter("salary");
		String experience = req.getParameter("exp");
		String id = req.getParameter("id proof");
		String idNumber = req.getParameter("id number");
		System.out.println(name + "\n" + email + "\n" + phnumber + "\n" + alternate + "\n" + gender + "\n"
				+ qualification + "\n" + yop + "\n" + university + "\n" + skills + "\n" + address + "\n" + salary + "\n"
				+ experience + "\n" + id + "\n" + idNumber);

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html><body><h1>This is Placement Details</h1>").append(name).append("<br>").append(email)
				.append("<br>").append(phnumber).append("<br>").append(alternate).append("<br>").append(gender)
				.append("<br>").append(qualification).append("<br>").append(yop).append("<br>").append(university)
				.append("<br>").append(skills).append("<br>").append(address).append("<br>").append(salary)
				.append("<br>").append(experience).append("<br>").append(id).append("<br>").append(idNumber)
				.append("</body></html>");

		FormDTO dtos = new FormDTO(name, email, Long.parseLong(phnumber), Long.parseLong(alternate), gender,
				qualification, yop, university, skills, address, Long.parseLong(salary), experience, id, idNumber);
		System.out.println(dto.add(dtos));

	}

}
