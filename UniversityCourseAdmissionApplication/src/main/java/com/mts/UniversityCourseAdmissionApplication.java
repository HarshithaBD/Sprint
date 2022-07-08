package com.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class UniversityCourseAdmissionApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversityCourseAdmissionApplication.class, args);


		System.out.println("connected to database");
	}

}
