package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Behind the scenes annotations...
// @EnableAutoConfiguration - enables Spring Boot's auto-configuration support
// @ComponentScan - Enables component scanning of current packcage
// 					Also recursively scans sub-packages
// @Configuration - Able to register extra beans with @Beans
//                  or import other configuration classes
@SpringBootApplication(
		scanBasePackages = {
				"com.luv2code.springcoredemo",
				"com.luv2code.util"})
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		// Bootstrap your Spring Boot application
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
