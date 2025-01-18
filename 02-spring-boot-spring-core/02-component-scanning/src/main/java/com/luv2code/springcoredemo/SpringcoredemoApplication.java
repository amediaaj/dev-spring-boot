package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Behind the scenes annotations...
// @EnableAutoConfiguration - enables Spring Boot's auto-configuration support
// @ComponentScan - Enables component scanning of current packcage
// 					Also recursively scans sub-packages
// @Configuration - Able to register extra beans with @Beans
//                  or import other configuration classes

//@SpringBootApplication(
//		scanBasePackages = {
//				"com.luv2code.springcoredemo", // explicitly list packages for scanning
//				"com.luv2code.util"})

// This causes the app to fail to start because the packages are not listed
// for component scanning, if components are in those packages
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		// Bootstrap your Spring Boot application
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
