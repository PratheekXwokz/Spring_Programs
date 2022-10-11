package com.xworkz.country.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CountryController {

	Collection<String> city = new ArrayList<String>();

	public CountryController() {
		System.out.println("Calling Default COnsturctor of" + this.getClass().getSimpleName());
	}

	@RequestMapping("/country.do")
	public String onSave(Model model) {
		System.out.println("Calling On Save Method");
		city.add("Bengaluru");
		city.add("Mysuru");
		city.add("Chennai");
		city.add("Shivamogga");
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Noida");
		model.addAttribute("cities", city);

		return "index.jsp";

	}

}
