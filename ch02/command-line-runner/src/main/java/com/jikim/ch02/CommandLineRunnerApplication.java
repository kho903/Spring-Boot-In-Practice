package com.jikim.ch02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunnerApplication /*implements CommandLineRunner*/ {

	protected static final Logger log = LoggerFactory.getLogger(CommandLineRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunnerApplication CommandLineRunner has Executed");
	}*/

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			log.info("CommandLineRunner executed as a bean definition with " + args.length + " arguments");
			for (String arg : args) {
				log.info("Argument: " + arg);
			}
		};
	}
}
