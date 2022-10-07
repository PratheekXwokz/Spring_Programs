package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {
	public LandController() {
		System.out.println("Calling default Construtor of ........"+this.getClass().getSimpleName());
	}

	@RequestMapping("/start.do")
	public String click() {
		System.out.println("running click LandController");
		return "index.jsp";
	}
}
