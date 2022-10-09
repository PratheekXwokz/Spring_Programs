package com.xworkz.musicandfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FoodDTO {

	private String foodName;
	private String price;
	private String hotelName;
	private String location;
	private String order;
	private String quantity;

	public FoodDTO() {

		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodDTO [foodName=" + foodName + ", price=" + price + ", hotelName=" + hotelName + ", location="
				+ location + ", order=" + order + ", quantity=" + quantity + "]";
	}

}
