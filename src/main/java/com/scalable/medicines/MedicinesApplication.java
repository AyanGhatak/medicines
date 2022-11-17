package com.scalable.medicines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MedicinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicinesApplication.class, args);
	}

}
