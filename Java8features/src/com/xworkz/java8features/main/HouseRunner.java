package com.xworkz.java8features.main;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.java8features.constants.OwningType;
import com.xworkz.java8features.constants.Type;
import com.xworkz.java8features.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {
		HouseDTO dto1 = new HouseDTO(1, "Pratheek", "Palangappa", Type.INDIVIDUAL, 2, false, OwningType.OWN, 2500d);
		HouseDTO dto2 = new HouseDTO(2, "Jaydeep", "Brigade", Type.APARTMENT, 25, true, OwningType.RENT, 1500d);
		HouseDTO dto3 = new HouseDTO(3, "Naveen", "Shoba", Type.APARTMENT, 27, false, OwningType.OWN, 5000d);
		HouseDTO dto4 = new HouseDTO(4, "Shashank", "Shashank", Type.INDIVIDUAL, 1, true, OwningType.RENT, 2700d);
		HouseDTO dto5 = new HouseDTO(5, "Joel", "Prestige", Type.VILLA, 2, true, OwningType.OWN, 1500d);
		HouseDTO dto6 = new HouseDTO(6, "Vivek", "Vivek", Type.INDIVIDUAL, 2, false, OwningType.LEASE, 3500d);
		HouseDTO dto7 = new HouseDTO(7, "Prajwal", "Brigade", Type.APARTMENT, 35, false, OwningType.LEASE, 4500d);
		HouseDTO dto8 = new HouseDTO(8, "Prokshith", "Tata", Type.VILLA, 3, true, OwningType.RENT, 2500d);
		HouseDTO dto9 = new HouseDTO(9, "Nikhil", "Nikhil", Type.INDIVIDUAL, 1, false, OwningType.OWN, 6500d);
		HouseDTO dto10 = new HouseDTO(10, "Suhas", "Palangappa", Type.INDIVIDUAL, 2, true, OwningType.OWN, 1800d);
		HouseDTO dto11 = new HouseDTO(11, "Sanjay", "Palangappa", Type.INDIVIDUAL, 2, false, OwningType.LEASE, 1200d);
		HouseDTO dto12 = new HouseDTO(12, "Sharan", "Prestige", Type.APARTMENT, 40, true, OwningType.LEASE, 3400d);
		HouseDTO dto13 = new HouseDTO(13, "Sharath", "Sharath", Type.INDIVIDUAL, 2, false, OwningType.OWN, 2500d);
		HouseDTO dto14 = new HouseDTO(14, "Pramod", "Pramod", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1900d);
		HouseDTO dto15 = new HouseDTO(15, "Vallabh", "Brigade", Type.VILLA, 4, false, OwningType.OWN, 2300d);
		HouseDTO dto16 = new HouseDTO(16, "rahul", "DLF", Type.APARTMENT, 32, true, OwningType.RENT, 2100d);
		HouseDTO dto17 = new HouseDTO(17, "Suraj", "DLF", Type.APARTMENT, 26, false, OwningType.OWN, 2000d);
		HouseDTO dto18 = new HouseDTO(18, "Srinath", "Prestige", Type.VILLA, 3, true, OwningType.LEASE, 2100d);
		HouseDTO dto19 = new HouseDTO(19, "Raghu", "Raghu", Type.INDIVIDUAL, 2, true, OwningType.OWN, 2000d);
		HouseDTO dto20 = new HouseDTO(20, "Satya", "Prestige", Type.APARTMENT, 30, true, OwningType.RENT, 1200d);

		List<HouseDTO> houseDTO = new ArrayList<HouseDTO>();
		houseDTO.add(dto1);
		houseDTO.add(dto2);
		houseDTO.add(dto3);
		houseDTO.add(dto4);
		houseDTO.add(dto5);
		houseDTO.add(dto6);
		houseDTO.add(dto7);
		houseDTO.add(dto8);
		houseDTO.add(dto9);
		houseDTO.add(dto10);
		houseDTO.add(dto11);
		houseDTO.add(dto12);
		houseDTO.add(dto13);
		houseDTO.add(dto14);
		houseDTO.add(dto15);
		houseDTO.add(dto16);
		houseDTO.add(dto17);
		houseDTO.add(dto18);
		houseDTO.add(dto19);
		houseDTO.add(dto20);

		houseDTO.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((e) -> System.out.println(e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> e2.getId().compareTo(e1.getId()))
				.forEach((e) -> System.out.println("Sort by desc: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.forEach((e) -> System.out.println("Sort Asc by Name: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> e2.getType().compareTo(e1.getType()))
				.forEach((e) -> System.out.println("Sort Desc by Type: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> e2.getSqfeet().compareTo(e1.getSqfeet()))
				.forEach((e) -> System.out.println("Sort Desc by SqFeet: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().filter((e) -> e.getLoan() == true).sorted((e1, e2) -> e2.getOwner().compareTo(e1.getOwner()))
				.forEach((e) -> System.out.println("With Loan Desc by owner: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().filter((e) -> e.getLoan() == false).sorted((e1, e2) -> e2.getOwner().compareTo(e1.getOwner()))
				.forEach((e) -> System.out.println("Without Loan Desc by owner: " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().filter((e) -> e.getOwningType() == OwningType.LEASE)
				.forEach((e) -> System.out.println("Owning Type is Lease " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().filter((e) -> e.getType() == Type.APARTMENT)
				.forEach((e) -> System.out.println("Type is Apartment " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().filter((e) -> e.getType() == Type.VILLA)
				.forEach((e) -> System.out.println("Type is Villa " + e));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> {
			int m = e1.getType().compareTo(e2.getType());
			if (m == 0) {
				return e1.getOwningType().compareTo(e2.getOwningType());
			}
			return m;
		}).forEach((e) -> System.out.println(e));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		houseDTO.stream().sorted((e1, e2) -> {
			int m = e2.getName().compareTo(e1.getName());
			if (m == 0) {
				return e2.getId().compareTo(e1.getId());
			}
			return m;
		}).forEach((e) -> System.out.println(e));

	}

}
