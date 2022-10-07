package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dasara.dto.SuicideDTO;

@Component
@RequestMapping("/")
public class SuicideController {

	public SuicideController() {
		System.out.println("Calling Default Constructor" + this.getClass().getSimpleName());
	}

	@RequestMapping("/suicide.do")
	public String onClick(SuicideDTO dto, Model model) {
		System.out.println("Running onClick method");
		System.out.println("Data inserted Are" + dto);
		model.addAttribute("data", dto);
		return "suicide.jsp";

	}

}
