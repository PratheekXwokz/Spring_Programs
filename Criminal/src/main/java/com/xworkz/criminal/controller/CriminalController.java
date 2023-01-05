package com.xworkz.criminal.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String onSave(CriminalDTO criminal,Model model,@RequestParam("image") MultipartFile file) throws IOException {
		System.out.println("Calling onSave Method");
		byte[] bytes=file.getBytes();
		Path path=Paths.get("E:/temp-files/"+file.getOriginalFilename());
		Files.write(path, bytes);
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
	
	@GetMapping("/findByName")
	public String findByName(HttpServletRequest req,Model model) {
		System.out.println("Running findByName");
		String name=req.getParameter("name");
		List<CriminalDTO> dtos = criminalService.findByName(name);
		if (dtos != null &&  !dtos.isEmpty()) {
			System.out.println("There are" + dtos.size() + " entries");
			model.addAttribute("criminaldetails", dtos);
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "data is empty");
		}
		return "CriminalDetails";
		
	}
	
	@GetMapping("/findByNameAndGender")
	public String findByNameAndGender(HttpServletRequest req,Model model) {
		System.out.println("Running findByNameAndAge");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		List<CriminalDTO> dtos = criminalService.findByNameAndGender(name,gender);
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
