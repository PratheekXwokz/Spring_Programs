package com.xworkz.metro.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
@Table(name = "metro_details")
public class MetroDetailsDTO extends BasicEntity{
	@Id
	private Integer id;
	private String name;
	private String train_lane;
	private Integer no_of_passengers;
	private Float ticket_price;
	private Float revenue;
	private String state;
	
	public MetroDetailsDTO(Integer id, String name, String train_lane, Integer no_of_passengers, Float ticket_price,
			Float revenue, String state,LocalDate created_at, String createdBy, LocalDate updated_at, String updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.train_lane = train_lane;
		this.no_of_passengers = no_of_passengers;
		this.ticket_price = ticket_price;
		this.revenue = revenue;
		this.state = state;
	}
	
	

}
