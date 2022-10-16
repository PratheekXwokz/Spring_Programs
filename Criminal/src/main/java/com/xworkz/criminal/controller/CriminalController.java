package com.xworkz.criminal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalController {

	@Autowired
	private CriminalService criminalService;

	public CriminalController() {

		System.out.println("calling Default Constructor of:" + this.getClass().getSimpleName());

	}

	@PostMapping
	public String onSave(CriminalDTO criminal,Model model) {
		System.out.println("Calling onSave Method");
		System.out.println("Details Entered Are:" + criminal);
		Boolean save = criminalService.validateAndSave(criminal);
		if (save) {
			System.out.println("The values are Sent to service:" + save);
			model.addAttribute("message", "Data Saved");
			return "index";
		} else {
			System.out.println("Details Are Incorrect");
		}
		return "index";

	}

	@GetMapping
	public String readAll(Model model) {
		System.out.println("Running realAll");
		List<CriminalDTO> dtos = criminalService.findAll();
		if (dtos != null &&  !dtos.isEmpty()) {
			System.out.println("There are" + dtos.size() + " entries");
			model.addAttribute("criminaldetails", dtos);
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "data is empty");
		}
		return "CriminalDetails";
	}
}
