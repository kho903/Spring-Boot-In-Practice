package com.jikim.ch02;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jikim.ch02.model.User;

@SpringBootApplication
public class BeanValidationCustomAnnotationApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(BeanValidationCustomAnnotationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BeanValidationCustomAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("kho903", "jihun");

		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<User>> violations = validator.validate(user1);
		log.error("Password for user1 do not adhere to the password policy");
		violations.forEach(constraintViolation -> log.error("Violation details: [{}]", constraintViolation.getMessage()));

		User user2 = new User("kho9031", "Sbip01$4UDfg");
		violations = validator.validate(user2);
		if (violations.isEmpty()) {
			log.info("Password for user2 adhere to the password policy");
		}

		User user3 = new User("kho9032", "Sbip01$4UDfggg");
		violations = validator.validate(user3);
		log.error("Password for user3 violates maximum repetitive rule");
		violations.forEach(constraintViolation -> log.error("Violation details: [{}].", constraintViolation.getMessage()));


		User user4 = new User("kho9032", "Sbip014UDfggg");
		violations = validator.validate(user4);
		log.error("Password for user4 violates special character rule");
		violations.forEach(constraintViolation -> log.error("Violation details: [{}].", constraintViolation.getMessage()));
	}
}
