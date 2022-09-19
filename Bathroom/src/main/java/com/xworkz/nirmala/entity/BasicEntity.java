package com.xworkz.nirmala.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasicEntity {

	public BasicEntity() {
	}

	public BasicEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCeratedDate() {
		return createdDate;
	}

	public void setCeratedDate(LocalDate ceratedDate) {
		this.createdDate = ceratedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}