package com.amediaa.springcoredemo;

import org.springframework.boot.SpringApplication;
// Enables Auto configuration, Component scanning, Additional configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(
//		scanBasePackages = {
//			"com.amediaa.springcoredemo",
//			"com.amediaa.util"
//		}
//)

// Behind the scenes...
// Composed of annotations -
// @EnableAutoConfiguration, @ComponentScan, @Configuration
@SpringBootApplication
public class SpringcoredemoApplication {
	// Bootstrap the Spring Boot application
	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
