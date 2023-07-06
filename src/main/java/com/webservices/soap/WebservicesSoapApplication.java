package com.webservices.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.webservices.*")
@EntityScan("com.webservices.*")
public class WebservicesSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicesSoapApplication.class, args);
	}

}
