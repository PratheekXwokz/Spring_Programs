package com.xworkz.nirmala.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.entity.NirmalaEntity;

public class NirmalaServiceImpl implements NirmalaService {
	
	NirmalaDAO nirmalaDAO = new NirmalaDAOImpl();

	public Boolean validateAndSave(NirmalaEntity entity) {
		 ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		 Validator validator = buildDefaultValidatorFactory.getValidator();
	Set<ConstraintViolation<NirmalaEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.err.println("Invalid");

		} else {
			System.out.println("valid");
			return nirmalaDAO.save(entity);
		}

		return false;
	}

}