package com.unidev.app.servicemonitoring;

import com.unidev.app.servicemonitoring.model.HTTPMonitoring;
import com.unidev.app.servicemonitoring.service.HTTPMonitoringRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ServicemonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicemonitoringApplication.class, args);
	}

    @Bean
    public CommandLineRunner runner(final HTTPMonitoringRepository repository) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {

                HTTPMonitoring httpMonitoring = new HTTPMonitoring();
                httpMonitoring.setUrl("http://tomato");

                repository.save(httpMonitoring);

                System.err.println(repository.findAll());
            }

        };
    }
//	@Bean
//	ServletRegistrationBean h2servletRegistration(){
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
//		registrationBean.addUrlMappings("/console/*");
//		return registrationBean;
//	}
}
