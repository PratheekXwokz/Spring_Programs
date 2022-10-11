package com.xworkz.country.dto;

public class CountryDTO {
	private String name;
	private String email;
	private String city;

	public CountryDTO() {
		System.out.println("Default constructor created " + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", email=" + email + ", city=" + city + "]";
	}

}
