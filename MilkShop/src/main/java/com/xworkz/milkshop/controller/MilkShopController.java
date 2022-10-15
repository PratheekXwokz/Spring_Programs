package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;

@Controller
@RequestMapping("/milk")
public class MilkShopController {

	@Autowired
	private MilkShopService milkShopService;

	public MilkShopController() {

		System.out.println("calling Default Constructor of:" + this.getClass().getSimpleName());

	}

	@PostMapping
	public String onSave(MilkShopDTO milk) {
		System.out.println("Calling onSave Method");
		System.out.println("Details Entered Are:" + milk);
		Boolean save = milkShopService.saveAndValidate(milk);
		if (save) {
			System.out.println("The values are Sent to service:" + save);
			return "Display";
		} else {
			System.out.println("Details Are Incorrect");
		}
		return "index";

	}
}
