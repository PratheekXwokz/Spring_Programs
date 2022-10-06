package com.xworkz.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class AppController {

	public AppController() {
		System.out.println("Calling Default Constructor of ....." + this.getClass().getSimpleName());
	}

	@RequestMapping("/start.do")
	public String onSet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Calling do Post method");
		String name = req.getParameter("name");
		String company = req.getParameter("company");
		String year = req.getParameter("year");
		String version = req.getParameter("version");
		String size = req.getParameter("size");
		String technology = req.getParameter("technology");

		req.setAttribute("nm", name);
		req.setAttribute("cm", company);
		req.setAttribute("yr", year);
		req.setAttribute("vr", version);
		req.setAttribute("sz", size);
		req.setAttribute("tl", technology);

		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index.jsp";
	}

//	@RequestMapping("/start.do")
//	public String submit() {
//		System.out.println("running submit appcontroller");
//		return "index.jsp";
//	}
}
