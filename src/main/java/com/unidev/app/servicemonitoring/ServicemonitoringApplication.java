package com.unidev.app.servicemonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServicemonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicemonitoringApplication.class, args);
	}

//	@Bean
//	ServletRegistrationBean h2servletRegistration(){
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
//		registrationBean.addUrlMappings("/console/*");
//		return registrationBean;
//	}
}
