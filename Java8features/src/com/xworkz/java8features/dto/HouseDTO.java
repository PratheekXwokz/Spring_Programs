package com.xworkz.java8features.dto;

import com.xworkz.java8features.constants.OwningType;
import com.xworkz.java8features.constants.Type;

public class HouseDTO {
	private Integer id;
	private String name;
	private String owner;
	private Type type;
	private Integer noOfFloors;
	private Boolean loan;
	private OwningType owningType;
	private Double sqfeet;

	public HouseDTO() {
		System.out.println("Calling default constructor of " + this.getClass().getSimpleName());
	}

	public HouseDTO(Integer id, String name, String owner, Type type, Integer noOfFloors, Boolean loan,
			OwningType owningType, Double sqfeet) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.owningType = owningType;
		this.sqfeet = sqfeet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Boolean getLoan() {
		return loan;
	}

	public void setLoan(Boolean loan) {
		this.loan = loan;
	}

	public OwningType getOwningType() {
		return owningType;
	}

	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}

	public Double getSqfeet() {
		return sqfeet;
	}

	public void setSqfeet(Double sqfeet) {
		this.sqfeet = sqfeet;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", owningType=" + owningType + ", sqfeet=" + sqfeet + "]";
	}

}
