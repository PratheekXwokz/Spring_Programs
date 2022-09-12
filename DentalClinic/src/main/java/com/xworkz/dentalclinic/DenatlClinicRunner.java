package com.xworkz.dentalclinic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DenatlClinicRunner {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("ClinicConfigure.xml");
		System.out.println(container);
		DentalClinic clinic=container.getBean(DentalClinic.class);
		System.out.println(clinic);

	}

}
