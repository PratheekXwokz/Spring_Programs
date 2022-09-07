package com.xworkz.tv;

import org.springframework.stereotype.Component;

@Component
public class Display {
	private String type;

	public Display() {
		System.out.println("TV has an LED Display");
	}
		
	public Display(String type) {
		this.type=type;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Display [type=" + type + "]";
	}
	

}
