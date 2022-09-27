package com.xworkz.metro.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class BasicEntity {

	private LocalDate created_at;
	private String createdBy;
	private LocalDate updated_at;
	private String updatedBy;

}
