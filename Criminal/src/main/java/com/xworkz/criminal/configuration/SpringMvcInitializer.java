package com.xworkz.criminal.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private String[] getServletMappings = { "/" };
	private Class[] getServletConfigClasses = { SpringConfiguration.class, DBConfiguration.class };

	public SpringMvcInitializer() {

		System.out.println("calling Default Constructor of:" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return getServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return getServletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Calling configureDefaultServletHandling Method");
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("Creating file Upload Customizer");
		// files uploaded will be saved here
		File upload = new File("E:/temp-files");

		// register a multipartconfigElement
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(upload.getAbsolutePath(), 100000,
				100000 * 2, 100000 / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
