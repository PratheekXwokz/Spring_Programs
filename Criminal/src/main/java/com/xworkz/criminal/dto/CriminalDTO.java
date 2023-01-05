package com.xworkz.criminal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "criminal_details")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select criminal from CriminalDTO criminal"),
		@NamedQuery(name = "findByName", query = "select criminal from CriminalDTO criminal where criminal.name=:nm"),
		@NamedQuery(name="findByNameAndGender",query="select criminal from CriminalDTO criminal where criminal.name=:nm and criminal.gender=:ge")})
public class CriminalDTO {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	private String criminalType;
	private Integer noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private Integer jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private String netWorth;

	public CriminalDTO() {
		System.out.println("Calling Default Constructor of ...." + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCriminalType() {
		return criminalType;
	}

	public void setCriminalType(String criminalType) {
		this.criminalType = criminalType;
	}

	public Integer getNoOfCases() {
		return noOfCases;
	}

	public void setNoOfCases(Integer noOfCases) {
		this.noOfCases = noOfCases;
	}

	public String getAlive() {
		return alive;
	}

	public void setAlive(String alive) {
		this.alive = alive;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInternational() {
		return international;
	}

	public void setInternational(String international) {
		this.international = international;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public Integer getJailTerm() {
		return jailTerm;
	}

	public void setJailTerm(Integer jailTerm) {
		this.jailTerm = jailTerm;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getRightHandName() {
		return rightHandName;
	}

	public void setRightHandName(String rightHandName) {
		this.rightHandName = rightHandName;
	}

	public String getLeftHandName() {
		return leftHandName;
	}

	public void setLeftHandName(String leftHandName) {
		this.leftHandName = leftHandName;
	}

	public String getPrisonName() {
		return prisonName;
	}

	public void setPrisonName(String prisonName) {
		this.prisonName = prisonName;
	}

	public String getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(String netWorth) {
		this.netWorth = netWorth;
	}

	@Override
	public String toString() {
		return "CriminalDTO [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", criminalType="
				+ criminalType + ", noOfCases=" + noOfCases + ", alive=" + alive + ", gender=" + gender
				+ ", international=" + international + ", married=" + married + ", jailTerm=" + jailTerm + ", wifeName="
				+ wifeName + ", rightHandName=" + rightHandName + ", leftHandName=" + leftHandName + ", prisonName="
				+ prisonName + ", netWorth=" + netWorth + "]";
	}

}
