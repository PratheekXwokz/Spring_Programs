package com.xworkz.musicandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicandfood.dto.FoodDTO;

@Component
@RequestMapping("/")
public class FoodController {

	Collection<FoodDTO> fList = new ArrayList<FoodDTO>();
	
	public FoodController() {
		
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
		
	}
	@RequestMapping("/food.do")
	public String onSave(FoodDTO food, Model model ) {
		System.out.println("Calling onSave Method");
		System.out.println("Details entered Are:"+food);
		fList.add(food);
		int size = fList.size();
		model.addAttribute("Food",food);
		model.addAttribute("Size", size);
		return "Food.jsp";
	} 
	
	@RequestMapping("/dFood.do")
	public String onSend(FoodDTO food, Model model) {
		System.out.println("Calling onSend Method");
		System.out.println("Details entered Are:"+food);
		model.addAttribute("List", fList);
		return "DisplayFood.jsp";
	}
}
