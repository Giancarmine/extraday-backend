package com.giancar.extraday_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.giancar.controllers"})
public class ExtradayBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtradayBackendApplication.class, args);
	}
}
