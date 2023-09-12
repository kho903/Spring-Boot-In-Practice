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

import com.jikim.ch02.model.Course;

@SpringBootApplication
public class BeanValidationApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(BeanValidationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BeanValidationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = new Course();
		course.setId(1);
		course.setRating(0);

		Validator validator
			= Validation.buildDefaultValidatorFactory().getValidator();

		Set<ConstraintViolation<Course>> violations =
			validator.validate(course);

		violations.forEach(courseConstraintViolation ->
			log.error("A constraint violation has occurred. Violation details: [{}].", courseConstraintViolation)
		);
	}
}
