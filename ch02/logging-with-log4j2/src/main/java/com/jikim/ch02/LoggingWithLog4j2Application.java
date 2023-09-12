package com.jikim.ch02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingWithLog4j2Application {

	private static final Logger log = LoggerFactory.getLogger(LoggingWithLog4j2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingWithLog4j2Application.class, args);
		log.info("LoggingWithLog4j2Application started successfully with Log4j2 configuration");
	}

}
