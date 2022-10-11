package com.xworkz.country.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.country.dto.CountryDTO;

@Component
@RequestMapping("/")
public class CountryDetailsController {
	public CountryDetailsController() {
		System.out.println("Country details Controller");
	}

	@RequestMapping("/display.do")
	public String display(CountryDTO dto, Model model) {
		System.out.println("Calling display Method");
		System.out.println("Details entered Are:" + dto);
		model.addAttribute("dto", dto);
		return "display.jsp";

	}

}
