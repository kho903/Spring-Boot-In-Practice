package com.jikim.ch02.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class MyCommandLineRunner implements CommandLineRunner {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void run(String... args) throws Exception {
		log.info("MyCommandLineRunner executed as a Spring Component");
	}
}
