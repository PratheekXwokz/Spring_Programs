package com.xworkz.nirmala.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.ToString;

@Entity
@Table(name = "nirmala_details")
@ToString(callSuper = true)

public class NirmalaEntity extends BasicEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Min(value = 1)
	private Integer id;
	 @NotNull
	private String location;
	 @NotNull
	private String gender;
	 @NotNull
	private String type;
	@NotNull
	private Integer cost;
     @NotNull
	private LocalTime duration;

	public NirmalaEntity() {
	}

	public NirmalaEntity(String location, String gender, String type, Integer cost, LocalTime duration,
			String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		// this.id = id;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

}

