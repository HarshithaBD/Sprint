package com.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.modelmapper.ModelMapper;
@SpringBootApplication
public class UniversityCourseAdmissionApplication {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(UniversityCourseAdmissionApplication.class, args);


		System.out.println("connected to database");

	}

}
