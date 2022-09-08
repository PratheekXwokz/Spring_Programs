package com.xworkz.iphone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewModel {
	private String modelName;
	private Integer yearLaunched;
	private Float price;

	public NewModel() {
		System.out.println("A new Product has been launched");
	}

	@Value("iPhone14")
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Value("2022")
	public void setYearLaunched(Integer yearLaunched) {
		this.yearLaunched = yearLaunched;
	}

	@Value("130000.00f")
	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewModel [modelName=" + modelName + ", yearLaunched=" + yearLaunched + ", price=" + price + "]";
	}

}
