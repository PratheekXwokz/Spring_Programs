package com.xworkz.tv;

import org.springframework.stereotype.Component;

@Component
public class Stand {
	private String material;
	
	public Stand() {
		System.out.println("The Color of Stand is Black");
	}

	public Stand(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Stand [material=" + material + "]";
	}
	

}
