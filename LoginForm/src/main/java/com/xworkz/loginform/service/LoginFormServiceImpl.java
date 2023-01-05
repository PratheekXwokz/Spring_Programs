package com.xworkz.loginform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.loginform.dao.LoginFormDAO;
import com.xworkz.loginform.dto.LoginFormDTO;

@Service
public class LoginFormServiceImpl implements LoginFormService {
	@Autowired
	private LoginFormDAO loginDAO;

	@Override
	public Boolean validateAndSave(LoginFormDTO login) {
		System.out.println("Calling validateAndSaveMethod");
		if (login.getUserName() != null && login.getUserName().length() >= 3 && login.getUserName().length() <= 30) {
			loginDAO.save(login);
			return true;
		} else {
			System.out.println("invalid Data");
			return false;
		}
	}

	@Override
	public List<LoginFormDTO> findAll() {
		System.out.println("Running findAll in service");
		return loginDAO.findAll();
	}

	@Override
	public List<LoginFormDTO> findByUserName(String name) {
		if (name != null && name.length() > 3) {
			System.out.println("Running findByName in Service");
			return loginDAO.findByUserName(name);
		} else {
			System.out.println("Invalid name");
		}
		return null;
	}
}
