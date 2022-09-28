package com.xworkz.company.dto;

public class CompanyDTO {
	private String name;
	private String founder;
	private String since;
	private String noOfEmployees;
	private String address;
	private String business;

	public CompanyDTO() {
		System.out.println("Calling Default CompanyDTO Constructor ");
	}

	public CompanyDTO(String name, String founder, String since, String noOfEmployees, String address,
			String business) {
		this.name = name;
		this.founder = founder;
		this.since = since;
		this.noOfEmployees = noOfEmployees;
		this.address = address;
		this.business = business;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(String noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", founder=" + founder + ", since=" + since + ", noOfEmployees="
				+ noOfEmployees + ", address=" + address + ", business=" + business + "]";
	}

}
