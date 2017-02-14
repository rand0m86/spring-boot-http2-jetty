package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
	}
}
