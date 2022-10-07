package com.xworkz.dasara.dto;

public class SuicideDTO {
	private String name;
	private int age;
	private String reason;
	private String gender;
	private int attempts;
	private String dateAndTime;
	private String type;

	public SuicideDTO() {
		System.out.println("Deault Constructor Created...." + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "SuicideDTO [name=" + name + ", age=" + age + ", reason=" + reason + ", gender=" + gender + ", attempts="
				+ attempts + ", dateAndTime=" + dateAndTime + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
