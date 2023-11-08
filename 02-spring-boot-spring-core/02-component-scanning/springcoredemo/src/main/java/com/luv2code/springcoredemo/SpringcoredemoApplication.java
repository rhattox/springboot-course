package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	// If you want to scan other packages, please add them like this:
	//	scanBasePackages={
	//		"com.luv2code.util",
	//		"com.luv2code.test"
	//	}
)
public class SpringcoredemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
