package com.xworkz.loginform.dao;

import java.util.List;

import com.xworkz.loginform.dto.LoginFormDTO;

public interface LoginFormDAO {
	void save(LoginFormDTO login);
	
	List<LoginFormDTO> findAll();
	List<LoginFormDTO> findByUserName(String name);
	

}
