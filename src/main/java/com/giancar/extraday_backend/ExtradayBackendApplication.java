package com.giancar.extraday_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ExtradayBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtradayBackendApplication.class, args);
	}
}
