package com.xworkz.iphone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IPhoneRunner {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("IPhoneConfig.xml");
		System.out.println(container);
		IPhone phone=container.getBean(IPhone.class);
		System.out.println(phone);

	}

}
