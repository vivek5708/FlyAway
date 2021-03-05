package com.controler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.model", "com.service", "com.controler"})
public class MainAppLaunch {
	
	public static void main(String[] args) {
		System.out.println("inside main function");
		SpringApplication.run(MainAppLaunch.class, args);
	}

}
