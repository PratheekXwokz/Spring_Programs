package com.xworkz.tv;

import org.springframework.stereotype.Component;

@Component
public class Remote {
	private String type;
	
	public Remote() {
		System.out.println("The Colour of Remote is Black");
	}
	
	public Remote(String type) {
		this.type=type;
	}
	

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Remote [type=" + type + "]";
	}

}
