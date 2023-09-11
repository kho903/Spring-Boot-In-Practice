package com.jikim.ch02;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("spring.config.on-not-found", "ignore");
		SpringApplication application
			= new SpringApplication(Application.class);
		application.setDefaultProperties(properties);
		application.run(args);
	}

}
