package com.amediaa.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Behind the scenes...
// Composed of annotations -
// @EnableAutoConfiguration, @ComponentScan, @Configuration
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
