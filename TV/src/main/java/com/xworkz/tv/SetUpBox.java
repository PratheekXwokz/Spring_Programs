package com.xworkz.tv;

public class SetUpBox {

	private String brand;

	public SetUpBox() {
		System.out.println("Set Up Box Brand is Red");
	}

	public SetUpBox(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "SetUpBox [brand=" + brand + "]";
	}

}
