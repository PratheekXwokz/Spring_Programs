package com.xworkz.milkshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;

@Service
public class MilkShopServiceImpl implements MilkShopService {

	@Autowired
	private MilkShopDAO milkShopDAO;

	@Override
	public Boolean saveAndValidate(MilkShopDTO milk) {
		System.out.println("Calling saveAndValidate Method");
		milkShopDAO.Save(milk);
		return true;
	}

}
