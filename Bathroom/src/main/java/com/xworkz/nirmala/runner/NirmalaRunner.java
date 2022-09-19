package com.xworkz.nirmala.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.nirmala.entity.NirmalaEntity;
import com.xworkz.nirmala.service.NirmalaService;
import com.xworkz.nirmala.service.NirmalaServiceImpl;

public class NirmalaRunner {

	public static void main(String[] args) {
		NirmalaEntity entity = new NirmalaEntity("BTM", "Male", "Public", 10, LocalTime.now(), "Charan",
				LocalDate.now(), "Ravi", LocalDate.now());
		NirmalaEntity entity1 = new NirmalaEntity("Madivala", "Male", "Private", 10, LocalTime.now(), "Mohan",
				LocalDate.now(), "Suhas", LocalDate.now());
		NirmalaEntity entity2 = new NirmalaEntity("Dj Halli", "Female", "Private", 10, LocalTime.now(), "Prajwal",
				LocalDate.now(), "DP", LocalDate.now());
		NirmalaEntity entity3 = new NirmalaEntity("Majestic", "Female", "Private", 25, LocalTime.now(), "Karthik",
				LocalDate.now(), "Basavaraj", LocalDate.now());
		NirmalaEntity entity4 = new NirmalaEntity("SadaShivanagara", "Male", "Public", 5, LocalTime.now(), "Roshan",
				LocalDate.now(), "Swami", LocalDate.now());
		NirmalaService nirmalaService = new NirmalaServiceImpl();
		nirmalaService.validateAndSave(entity);
		nirmalaService.validateAndSave(entity1);
		nirmalaService.validateAndSave(entity2);
		nirmalaService.validateAndSave(entity3);
		nirmalaService.validateAndSave(entity4);
	}

}
