package com.jikim.ch04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jikim.ch04.model.Course;
import com.jikim.ch04.repository.CourseRepository;

@Service
public class CourseService {
	private CourseRepository courseRepository;

	@Autowired
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Iterable<Course> getAvailableCourse() {
		return courseRepository.findAll();
	}
}
