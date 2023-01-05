package com.xworkz.criminal.service;

import java.util.List;

import com.xworkz.criminal.dto.CriminalDTO;

public interface CriminalService {
	Boolean validateAndSave(CriminalDTO dto);

	List<CriminalDTO> findAll();
	List<CriminalDTO> findByName(String name);
	List<CriminalDTO> findByNameAndGender(String name,String gender);

}
