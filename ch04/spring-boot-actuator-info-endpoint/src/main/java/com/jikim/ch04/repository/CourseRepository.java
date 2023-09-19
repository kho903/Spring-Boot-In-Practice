package com.jikim.ch04.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jikim.ch04.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
