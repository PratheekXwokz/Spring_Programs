package com.xworkz.loginform.service;

import java.util.List;

import com.xworkz.loginform.dto.LoginFormDTO;

public interface LoginFormService {
	Boolean validateAndSave(LoginFormDTO login);
	
	List<LoginFormDTO> findAll();
	List<LoginFormDTO> findByUserName(String name);

}
