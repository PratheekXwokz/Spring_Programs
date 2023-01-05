package com.xworkz.loginform.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.loginform.dto.LoginFormDTO;
import com.xworkz.loginform.service.LoginFormService;

@Controller
@RequestMapping("/login")
public class LoginFormController {

	@Autowired
	private LoginFormService loginService;

	public LoginFormController() {
		System.out.println("Calling Default Constructor of: " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(LoginFormDTO login, Model model, @RequestParam("image") MultipartFile file)
			throws IOException {
		System.out.println("Calling onSave Method");
		byte[] bytes = file.getBytes();
		String string = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		Path path = Paths.get("E:/temp-files/" + string);
		Files.write(path, bytes);
		login.setFileName(string);
		System.out.println("Details Entered Are:" + login);
		Boolean save = loginService.validateAndSave(login);
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
		List<LoginFormDTO> dtos = loginService.findAll();
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("There are" + dtos.size() + " entries");
			model.addAttribute("logindetails", dtos);
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "data is empty");
		}
		return "DisplayUser";
	}

	@GetMapping("**/image")
	public void sendFile(@RequestParam String filename, HttpServletResponse response) throws IOException {
		System.out.println("running sendFile..." + filename);
		// file name from DB
		// Path can be static
		File file = new File("E://temp-files/" + filename);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (OutputStream stream = response.getOutputStream()) {
			stream.write(Files.readAllBytes(file.toPath()));
		}
	}

	@GetMapping("/findByUserName")
	public String findByName(HttpServletRequest req, Model model) {
		System.out.println("Running findByName");
		String name = req.getParameter("userName");
		List<LoginFormDTO> dtos = loginService.findByUserName(name);
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("There are" + dtos.size() + " entries");
			model.addAttribute("logindetails", dtos);
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "data is empty");
		}
		return "DisplayUser";

	}

}
