package com.xworkz.form.dto;

public class FormDTO {
	private String name;
	private String email;
	private Long phnumber;
	private Long alternate;
	private String gender;
	private String qualification;
	private String yop;
	private String university;
	private String skills;
	private String address;
	private Long salary;
	private String experience;
	private String id;
	private String idNumber;

	public FormDTO() {
		System.out.println("Form DTO has been created");
	}

	public FormDTO(String name, String email, Long phnumber, Long alternate, String gender, String qualification,
			String yop, String university, String skills, String address, Long salary, String experience, String id,
			String idNumber) {
		this.name = name;
		this.email = email;
		this.phnumber = phnumber;
		this.alternate = alternate;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		this.university = university;
		this.skills = skills;
		this.address = address;
		this.salary = salary;
		this.experience = experience;
		this.id = id;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "FormDTO [name=" + name + ", email=" + email + ", phnumber=" + phnumber + ", alternate=" + alternate
				+ ", gender=" + gender + ", qualification=" + qualification + ", yop=" + yop + ", university="
				+ university + ", skills=" + skills + ", address=" + address + ", salary=" + salary + ", experience="
				+ experience + ", id=" + id + ", idNumber=" + idNumber + "]";
	}

}
