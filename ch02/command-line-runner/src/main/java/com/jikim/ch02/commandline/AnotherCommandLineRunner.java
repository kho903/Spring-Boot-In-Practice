package com.jikim.ch02.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class AnotherCommandLineRunner implements CommandLineRunner {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void run(String... args) throws Exception {
		log.info("AnotherCommandLineRunner executed as a Spring Component");
	}
}
