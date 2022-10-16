package com.xworkz.criminal.dao;

import java.util.List;

import com.xworkz.criminal.dto.CriminalDTO;

public interface CriminalDAO {
	void save(CriminalDTO criminal);

	List<CriminalDTO> findAll();

}
