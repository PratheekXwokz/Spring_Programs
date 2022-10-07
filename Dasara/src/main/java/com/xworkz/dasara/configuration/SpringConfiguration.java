package com.xworkz.dasara.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Calling Spring Config... Default constructor"+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "SpringConfiguration [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
