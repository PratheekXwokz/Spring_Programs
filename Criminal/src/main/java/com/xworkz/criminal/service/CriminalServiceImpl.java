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
		return criminalDAO.findAll();
	}

	@Override
	public List<CriminalDTO> findByName(String name) {
		if (name != null && name.length() > 3) {
			System.out.println("Running findByName in Service");
			return criminalDAO.findByName(name);
		} else {
			System.out.println("Invalid name");
		}
		return null;
	}

	@Override
	public List<CriminalDTO> findByNameAndGender(String name, String gender) {
		if (name != null && name.length() > 3 && gender !=null) {
			System.out.println("Running findByName And Gender in Service");
			return criminalDAO.findByNameAndGender(name, gender);
		} else {
			System.out.println("Invalid Name and Age");
		}

		return null;
	}

}
