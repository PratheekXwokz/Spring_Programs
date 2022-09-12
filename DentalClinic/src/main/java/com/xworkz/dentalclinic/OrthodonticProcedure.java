package com.xworkz.dentalclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrthodonticProcedure {
	@Value("${treatmentCost}")
	private Float treatmentCost;
	@Value("${duration}")
	private Integer duration;

	public OrthodonticProcedure() {
		System.out.println("Happy Smiling");
	}

	@Override
	public String toString() {
		return "OrthodonticProcedure [treatmentCost=" + treatmentCost + ", duration=" + duration + "]";
	}

}
