package com.xworkz.criminal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dto.CriminalDTO;

@Service
public class CriminalServiceImpl implements CriminalService {
	@Autowired
	private CriminalDAO criminalDAO;

	@Override
	public Boolean validateAndSave(CriminalDTO dto) {
		System.out.println("Calling validateAndSaveMethod");
		if (dto.getName() != null && dto.getName().length() >= 3 && dto.getName().length() <= 30) {
			criminalDAO.save(dto);
			return true;
		} else {
			System.out.println("invalid Data");
			return false;
		}
	}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Running findAll in service");
		List<CriminalDTO> find = criminalDAO.findAll();
		return criminalDAO.findAll();
	}

}
