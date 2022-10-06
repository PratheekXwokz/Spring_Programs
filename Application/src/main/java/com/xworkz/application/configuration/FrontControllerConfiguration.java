package com.xworkz.application.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public  FrontControllerConfiguration() {
		System.out.println("Created using default Constructor"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running root configuration");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running get servlet configuration");
		return new Class[] {SpringConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running get servletmappings");
		return new String[] {"*.do"};
	}

}
