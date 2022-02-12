package com.example.spring.jpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.spring.jpa.example"})
@EntityScan(basePackages = {"com.example.spring.jpa.example"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
