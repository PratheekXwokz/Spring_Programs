package com.xworkz.iphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IPhone {
	@Value("Apple")
	private String brand;
	@Value("2022")
	private Integer yearLaunched;

	@Autowired
	private NewModel model;

	public IPhone() {
		System.out.println("Welocme to The IPhone Store");
		System.out.println("Would you Like to Try our New Product");
	}

	public IPhone(Integer yearLaunched) {
		this.yearLaunched = yearLaunched;
	}

	@Override
	public String toString() {
		return "IPhone [brand=" + brand + ", yearLaunched=" + yearLaunched + ", model=" + model + "]";
	}
	

}
