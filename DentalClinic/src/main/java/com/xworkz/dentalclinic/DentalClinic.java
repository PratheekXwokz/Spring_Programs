package com.xworkz.dentalclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DentalClinic {
	@Value("${name}")
	private String name;
	@Value("${doctorName}")
	private String doctorName;
	private Integer consultingFees;
	
	@Autowired
	private OrthodonticProcedure procedure;

	public DentalClinic() {
		System.out.println("Welcome to the clinic");

	}
	
	@Value("Complete Denistry")
	public void setName(String name) {
		this.name = name;
	}
	
//	@Value("Dr. Laksith Biddappa")
//	public void setDoctorName(String doctorName) {
//		this.doctorName = doctorName;
//	}

	@Value("500")
	public void setConsultingFees(Integer consultingFees) {
		this.consultingFees = consultingFees;
	}

	@Override
	public String toString() {
		return "DentalClinic [name=" + name + ", doctorName=" + doctorName + ", consultingFees=" + consultingFees
				+ ", procedure=" + procedure + "]";
	}
	
	
	

}
